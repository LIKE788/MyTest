package LX.test;

import LX.bean.Token.AccessToken;
import LX.utils.NetUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

public class test {
    /*
        获取AccessToken
     */
    @Test
    public void test1(){
        AccessToken token = NetUtils.getAccessToken();
        System.out.println(token.getAccess_token());
        System.out.println(token.getExpires_in());
    }

    /*
        创建自定义菜单
     */
    @Test
    public void test2() throws IOException {
        NetUtils.createMenu(NetUtils.getAccessToken());
    }

    /*
       获取自定义菜单信息
    */
    @Test
    public void test3() throws IOException {
        String menuInfo = NetUtils.GEMenuInfo(NetUtils.getAccessToken());
        System.out.println(menuInfo);
    }

    /*
       删除自定义菜单
    */
    @Test
    public void test4() throws IOException {
        NetUtils.DeleteMenuInfo(NetUtils.getAccessToken());
//        System.out.println(menuInfo);
    }

    /*
       生成二维码
    */
    @Test
    public void test5() throws IOException {
        String ticke = NetUtils.CodeTicket(NetUtils.getAccessToken());
        System.out.println(ticke);
    }

    /*
       上传临时素材
    */
    @Test
    public void test6() throws IOException {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要上传的文件路径");
        String filePath="C:\\Users\\Administrator\\Music\\MZDGL.mp3";
        String filePath1="C:\\Users\\Administrator\\Pictures\\Saved Pictures\\LBLD.jpg";

        String voice = NetUtils.uploadFile(filePath, NetUtils.getAccessToken(), "voice");
        String image = NetUtils.uploadFile(filePath1, NetUtils.getAccessToken(), "image");

        System.out.println(voice);
        System.out.println(image);
    }

    /*
       获取临时素材
    */
    @Test
    public void test7() throws IOException {
        String media="iA6jL3_OWcke9pWkuC4jNj74kQCblPrtuPazJ51FKfMIX24BH9Gk41uMuakI_iKv";
//        String media1="m2DVkvSFsXWswKXrhC3Shu9p1pfb3NPS7SLMY9QCbntRxygg9T_l6e_AJCD7AZXv";
        NetUtils.getMedia(NetUtils.getAccessToken(),media);
//        NetUtils.getMedia(NetUtils.getAccessToken(),media1);
    }

//    @Test
//    public void test8() throws IOException {
////        String media1="m2DVkvSFsXWswKXrhC3Shu9p1pfb3NPS7SLMY9QCbntRxygg9T_l6e_AJCD7AZXv";
//        NetUtils.main();
////        NetUtils.getMedia(NetUtils.getAccessToken(),media1);
//    }

//    public static String main (String content) throws IOException {//百度翻译接口
//        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
//        String result = api.getTransResult(content, "auto", "auto");
//        //System.out.println("这是个："+api.getTransResult(content, "auto", URLEncoder.encode("auto")));
//        ObjectMapper mapper = getObjectMapper();
//        Result result1 = mapper.readValue(result, Result.class);//json————————对象
//        List<trans_result> trans_result = result1.getTrans_result();
//        System.out.println(trans_result.get(0).getDst());
//        return trans_result.get(0).getDst();
//    }
}
