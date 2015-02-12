package playground;

import org.osgl.mvc.result.Result;
import org.osgl.oms.app.AppContext;

public class C2 extends CBase {

    private boolean cond1() {
        return true;
    }

    public void foo(String id, String email, AppContext ctx) {
        if (cond1()) {
            ctx.param("id", id);
            ctx.param("email", email);
            render(id, email);
        } else if (id.hashCode() < 10) {
            ctx.param("id", id);
            render(id);
        } else {
            throw render(email);
        }
    }

    public Result bar() {
        return ok();
    }

    public static void main(String[] args) {
        System.out.println(C2.class);
    }
}