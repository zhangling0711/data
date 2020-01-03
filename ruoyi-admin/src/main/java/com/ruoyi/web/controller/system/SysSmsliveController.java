package com.ruoyi.web.controller.system;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @Description:
 * @Return: $returns$
 * @Author: 卢思
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * @开发版本：综合练习V0.1
 */
@RequestMapping("/system/smslive")
@Controller
public class SysSmsliveController {
    private String prefix = "system/smslive";
//system/smslive

    @RequiresPermissions("system:smslive:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/smslive";
    }
}
