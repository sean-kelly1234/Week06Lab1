/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylogin.utility;

import javax.servlet.http.Cookie;

/**
 *
 * @author 642202
 */
public class CookieUtility {
    public static Cookie getCookie(Cookie[] cookies, String cookieName){
        Cookie c = null;
        for (Cookie cookie: cookies){
            if (cookie.getName().equals(cookieName)){
                c = cookie;
            }
        }
        return c;
    }
    
    public static Cookie removeCookie(Cookie[] cookies, String cookieName){
        Cookie c = null;
        for (Cookie cookie: cookies){
            if (cookie.getName().equals(cookieName)){
                c = cookie;
                c.setMaxAge(0);
                c.setPath("/");
            }
        }
        return c;
    }
    
}
