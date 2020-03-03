package com.lovejobs.controller;

import com.lovejobs.util.ResultUtil;
import com.lovejobs.vo.LoginRequest;
import com.lovejobs.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@Api("用户登陆")
@RestController
@RequestMapping("/user")
public class FirstController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登陆", notes = "通过用户名称、密码登陆")
    public Result login(@RequestBody LoginRequest loginRequest){
        return ResultUtil.ok(true);
    }
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息", notes = "通过userid获取用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name="userId",value = "用户id",dataType ="String",required = true,paramType ="query")
    )
    public Result info(@RequestParam String userId){
        return ResultUtil.ok(true);
    }
}
