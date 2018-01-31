package builder;

import android.app.AlertDialog;
import android.content.Context;

/**
 * 作者: zengqinrui on 17/12/22 23:04
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class MyAlertDialog {

    private Builder builder;

    private MyAlertDialog(Builder builder) {
        this.builder = builder;
    }

    public void show() {
        AlertDialog dialog = new AlertDialog.Builder(builder.context).create();
        dialog.setTitle(builder.title);
        dialog.setMessage(builder.content);
        dialog.show();
    }

    public static class Builder{
        String title;
        String content;
        Context context;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }


        public MyAlertDialog build(){
            return new MyAlertDialog(this);
        }

    }

}
