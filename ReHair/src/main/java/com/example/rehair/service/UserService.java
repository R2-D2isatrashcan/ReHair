package com.example.rehair.service;


import com.example.rehair.model.Article;
import com.example.rehair.model.ReturnData;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

// 接口向下转型，有点让人难以理解emm
public interface UserService {

    public ReturnData register(String userName, String passWd, String email);

    public ReturnData login(HttpServletRequest req, String userName, String passWd);

    public String addFriend(String userName, String futureFriendName);

    ReturnData setHead(String userName, String image);

    String getHead(String userName);

    // 创建动态，同时发送到目标角落？
    // String res = userService.createShare(userName, content, likeCount, time);
    public String createShare(String userName, String textContent, String likeCount, String time);

    // String res = userService.uploadArticlePhoto(userName, time, b64encodeImg);
    public String uploadArticlePhoto(String userName, String time, String b64encodeImg, String imgType);

    public ArrayList<Article> getArticle(String userName, int start, int bias);
}


