package DesignModel.single;

/**
 * @author hongfenlv
 * @Desc 单例模式
 * @date 2020-07-20 上午11:15
 */
public class Single {
    private static volatile Single single;

    private Single(){

    }

    public static Single getInstance(){
        if(single==null){
            synchronized(Single.class){
                if(single==null){
                    single=new Single();
                }
            }
        }
        return single;
    }

}
