package com.yeqifu.sys.config;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

public class PlaintextCredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        // 将输入的密码（字符数组）转换为 String
        char[] inputPasswordArray = (char[]) token.getCredentials();
        String inputPassword = new String(inputPasswordArray);

        // 从 AuthenticationInfo 中获取存储的密码（也为字符数组）
        String storedPassword = (String) info.getCredentials();

        // 比较明文密码
        return inputPassword.equals(storedPassword);
    }
}
