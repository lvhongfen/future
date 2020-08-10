
package DesignModel.single;
/**
 * @Desc 单例模式
 * singel data model lazy model
 * @Author lvhf
 * @Date 20202/07/20
 *
 */
public class HungrySingle{
    private static HungrySingle single=new HungrySingle();
    private HungrySingle(){

    }
    public static HungrySingle getInstance(){
        return single;
    }

}