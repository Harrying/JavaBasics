package com.action;

import com.dao.Impl.AttendDaoImpl;
import com.dao.AttendDao;
import com.eneity.Attend;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import java.util.List;

public class AttendAction extends ActionSupport implements ModelDriven {
    private Attend attend = new Attend();
    public static int kq_id=0;
    AttendDao attendDao = new AttendDaoImpl();

    public Attend getAttend() {
        return attend;
    }

    public void setAttend(Attend attend) {
        this.attend = attend;
    }

    @Override
    public Attend getModel() {
        return attend;
    }

    public String add_attend(){
        String string = null;
        boolean flag = attendDao.addAttend(attend);
        if (flag){
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("error","添加失败");
        }
        return string;
    }

    public String select_attend(){
        String string = null;
        List<Attend> list = attendDao.selectAttend();
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

    public String select_one_attend(){
        String string = null;
        List<Attend> list = attendDao.selectOneAttend(attend);
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

    public String delete_attend(){
        String string = null;
        boolean flag = attendDao.deleteAttend(attendDao.selectOneAttend(attend).get(0));
        if (flag){
            this.addFieldError("deleteSuccess","删除成功");
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("deleteError","删除失败");
        }
        return string;
    }

    public String update_attend(){
        String string = null;
        boolean flag = attendDao.updateAttend(kq_id,attend);
        if (flag){
            string = SUCCESS;
        }else {
            string = INPUT;
            this.addFieldError("updateError","修改失败");
        }
        return  string;
    }

    public String update_select_attend(){
        List<Attend> list = attendDao.selectOneAttend(attend);
        ActionContext.getContext().getValueStack().set("updatelist",list);
        kq_id =(list.get(0).getKq_id());
        return SUCCESS;
    }

}
