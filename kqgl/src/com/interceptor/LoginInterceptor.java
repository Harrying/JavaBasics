package com.interceptor;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation inv) throws Exception {
        ActionContext context = ActionContext.getContext();
        String id = String.valueOf(context.getSession().get("id"));
        System.out.println(id +"shdh");
        if(id != null ){
            return inv.invoke();
        }else{
            ((ActionSupport)inv.getAction()).addActionError("请先登录！！！");
            return Action.LOGIN;
        }
    }

}

