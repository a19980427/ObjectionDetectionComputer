package com.qihang.objectiondetectioncomputer.Service;

import com.qihang.objectiondetectioncomputer.Confituration.PythonConf;
import com.qihang.objectiondetectioncomputer.Utils.Enums.ScriptExecuteStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * @author qihang
 * @create 2022-09-18 下午  02:50
 */
@Service
public class ComputeServiceImpl implements ComputeService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private PythonConf pythonConf;


    @Override
    public void getPicture(String redisPictureKey) {
        String o = (String) redisTemplate.opsForValue().get(redisPictureKey);
        if (Objects.isNull(o)) {
            throw new NoSuchElementException();
        }
        execute("C:\\Users\\大橘\\Desktop\\2.png");
    }

    @Override
    public void execute(String path) {
        String executeString = new StringBuilder()
                .append(pythonConf.getAnacondaExecutor())
                .append(" ")
                .append(pythonConf.getScriptPath())
                .append(" ")
                .append(path).toString();

        Process process = null;

        try {
            System.out.println("执行脚本: " + executeString);
            process = Runtime.getRuntime().exec(executeString);
            int executeResult = new ObjectInputStream(process.getInputStream()).readInt();
            System.out.println("检测结果: " + ScriptExecuteStatus.getByCode(executeResult));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
