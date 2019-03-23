package com.action;

import com.dao.Impl.LoginDaoImpl;
import com.dao.LoginDao;
import com.eneity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

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
    public String loginAction(){
        String string = null;
        LoginDao login = new LoginDaoImpl();
        if (login.loginUser(user)){
            ActionContext context = ActionContext.getContext();
            context.getSession().put("user",user);
            if (user.getType()==1) {
                string = SUCCESS;
            }else {
                string = "success1";
            }
        }else {
            string = INPUT;
            this.addFieldError("error", "用户名或密码不正确！！");
        }
        return string;

    }
}
