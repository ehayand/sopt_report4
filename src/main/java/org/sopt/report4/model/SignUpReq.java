package org.sopt.report4.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ehay@naver.com on 2018-11-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Data
public class SignUpReq {
    private String name;
    private String password;
    private String part;

    //프로필 사진 객체
    private MultipartFile profile;
    //프로필 사진 저장 url 주소
    private String profileUrl;
}
