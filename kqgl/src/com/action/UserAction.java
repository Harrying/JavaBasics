package com.action;

import com.dao.Impl.UserDaoImpl;
import com.dao.UserDao;
import com.eneity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.List;

public class UserAction extends ActionSupport implements ModelDriven {
    private User user = new User();
    public static int id=0;
    UserDao userDao = new UserDaoImpl();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        return user;
    }

    public String add_user(){
        String string = null;
        boolean flag = userDao.addUser(user);
        if (flag){
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("error","添加失败");
        }
        return string;
    }

    public String select_user(){
        String string = null;
        List<User> list = userDao.selectUser();
        if (null ==list || list.size() ==0){
            string = INPUT;
            this.addFieldError("error1","查询失败");
        }else {
            ValueStack stack = ActionContext.getContext().getValueStack();
            stack.set("list",list);
            string = SUCCESS;
        }
        return string;
    }

    public String select_one_user(){
        String string = null;
        List<User> list = userDao.selectOneUser(user);
        if (null ==list || list.size() ==0){
            string = INPUT;
            this.addFieldError("selectError","没有查询到该人");
        }else {
            ValueStack stack = ActionContext.getContext().getValueStack();
            stack.set("list",list);
            string = SUCCESS;
        }
        return string;
    }

    public String delete_user(){
        String string = null;
        boolean flag = userDao.deleteUser(userDao.selectOneUser(user).get(0));
        if (flag){
            this.addFieldError("deleteSuccess","删除成功");
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("deleteError","删除失败");
        }
        return string;
    }

    public String update_user(){
        String string = null;
        boolean flag = userDao.updateUser(id,user);
        if (flag){
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("updateError","修改失败");
        }
        return  string;
    }

    public String update_select_user(){
        List<User> list = userDao.selectOneUser(user);
        ActionContext.getContext().getValueStack().set("updatelist",list);
        id = Integer.parseInt(list.get(0).getId());
        return SUCCESS;
    }

}
