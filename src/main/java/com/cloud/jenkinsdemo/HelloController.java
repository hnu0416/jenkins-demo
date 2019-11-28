package com.cloud.jenkinsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * HelloController
 * 
 * @author ouyangzhenqiang
 * @date 2019/05/08 22:23
 */
@Controller
@RequestMapping("/link/hello")
public class HelloController {
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Map<String, Object> sayHello() {
		Map<String, Object> result = new HashMap<String, Object>(4);
		try {
			result.put("success", true);
			result.put("new jar", "add jar sync type");
			result.put("new", "add tag 2019.05.21-194224-develop");
			result.put("type", "jenkins");
			result.put("message", "Hello, this is spring boot application from docker container on jenkins! ");
			result.put("triggers", "CI by web hook!");
		} catch (Exception e) {
			result.put("success", false);
			result.put("message", e.getMessage());
		}
		return result;
	}

}
