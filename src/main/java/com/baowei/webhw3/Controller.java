package com.baowei.webhw3;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    @RequestMapping("/showbook")
    public List<Book> showbook() {
        List<Book> booklist = new LinkedList<Book>();
        booklist.add(new Book("解忧杂货店","9787544270878","[日]东野圭吾",1000));
        booklist.add(new Book("摆渡人","9787550013247","[英]克莱儿·麦克福尔",1030));
        booklist.add(new Book("人间失格","9787544270878","[日]太宰治",1040));
        booklist.add(new Book("月亮和六便士","9787544270878","[英]毛姆",1050));
        booklist.add(new Book("百年孤独","9787544270878","加西亚·马尔克斯",1060));
        booklist.add(new Book("苏菲的世界","9787506394864","[挪威]乔斯坦·贾德",1070));
        booklist.add(new Book("追风筝的人","9787208061644","[美]卡勒德·胡赛尼",1090));
        return booklist;
    }
}
