package org.sopt.report4.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by ehay@naver.com on 2018-11-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Slf4j
@RestController
public class MainController {

    @GetMapping("")
    public String getTime() {
        LocalDateTime time = LocalDateTime.now();
        return time.getHour() + "시 " + time.getMinute() + "분 " + time.getSecond() + "초";
    }
}
