package com.qihang.objectiondetectioncomputer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * @author qihang
 * @create 2022-09-18 下午  02:50
 */
@Service
@ConfigurationProperties(prefix = "pythonconfig")
public class ComputeServiceImpl implements ComputeService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private String anacondaPrefix;
    private String execPrefix;


    @Override
    public void getPicture(String redisPictureKey) {
        String o = (String) redisTemplate.opsForValue().get(redisPictureKey);
        if (Objects.isNull(o)) {
            throw new NoSuchElementException();
        }
        execute("null");
    }

    @Override
    public void execute(String path) {
        System.out.println(anacondaPrefix);
        System.out.println(execPrefix);
    }
}
