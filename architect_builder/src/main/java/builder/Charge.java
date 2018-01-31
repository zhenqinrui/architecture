package builder;

import android.os.Build;
import android.util.Log;

/**
 * 作者: zengqinrui on 17/12/22 22:52
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

// 支付
public class Charge {

    private Builder builder;

    private Charge(Builder builder) {
        this.builder = builder;
    }

    public void pay() {
        if ("alipay".equals(builder.param.channel)) {
            Log.i("zqr", "alipay:" + builder.param.product);
        } else if("wxpay".equals(builder.param.channel)) {
            Log.i("zqr", "wxpay:" + builder.param.product);
        }
    }

    public static class ChargeParam{
        String orderId;
        String channel;
        String product;
    }

    public static class Builder {
        ChargeParam param;

        public Builder() {
            this.param = new ChargeParam();
        }

        public Builder orderId(String orderId) {
            this.param.orderId = orderId;
            return this;
        }

        public Builder channel(String channel) {
            this.param.channel = channel;
            return this;
        }

        public Builder product(String product) {
            this.param.product = product;
            return this;
        }

        public Charge build() {
            return new Charge(this);
        }

    }
}
