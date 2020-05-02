package com.design.pattern.template.jdbc;

import java.util.List;

public class MemberDaoTest  {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> rest = memberDao.selectAll();
        System.out.println(rest);
    }
}
