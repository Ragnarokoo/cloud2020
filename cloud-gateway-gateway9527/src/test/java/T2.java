import java.time.ZonedDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/21
 * @Version 1.0
 * @description
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zdt = ZonedDateTime.now(); // default zone time
        System.out.println(zdt);
        // 2023-04-21T20:21:42.028+08:00[Asia/Shanghai]
    }
}
