package com.qihang.objectiondetectioncomputer.Controller;

import com.qihang.objectiondetectioncomputer.Service.ComputeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author qihang
 * @create 2022-09-18 下午  02:47
 */

@Api("Compute")
@RestController
@RequestMapping("/compute")
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @GetMapping("/objectDetect")
    @ApiOperation("图片获取")
    public void objectDetect(@RequestParam String pictureKey) {
        computeService.getPicture(pictureKey);
    }
}
