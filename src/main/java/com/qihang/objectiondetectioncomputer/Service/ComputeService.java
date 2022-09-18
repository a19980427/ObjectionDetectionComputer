package com.qihang.objectiondetectioncomputer.Service;

/**
 * @author qihang
 * @create 2022-09-18 下午  02:49
 */

public interface ComputeService {

    void getPicture(String redisPictureKey);

    void execute(String path);
}
