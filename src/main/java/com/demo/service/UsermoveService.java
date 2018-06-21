package com.demo.service;

import com.demo.Entity.Usermove;
import com.demo.repository.UsermoveRepo;
import com.demo.util.DateUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class UsermoveService {

    @Autowired
    private UsermoveRepo usermoveRepo;

//  @Transactional
//  public void save(List<Sale> sales) {
//    String createDate = sales.get(0).getCreateDate();
//    saleRepo.deleteByCreateDate(createDate);
//    saleRepo.save(sales);
//  }

    public List<String[]> find(String mdn,String firsttime,String lasttime) {
        String base = "2017-04-17+00:00";
        String[] first = firsttime.split("-");
        String[] firsts = first[2].split(" ");
        String[] firstss = firsts[1].split(":");
        int ftime = (Integer.parseInt(firsts[0]) - 17) * 3600 * 24 + (Integer.parseInt(firstss[0])) * 3600 + (Integer.parseInt(firstss[1])) * 60;

        String[] last = lasttime.split("-");
        String[] lasts = last[2].split(" ");
        String[] lastss = lasts[1].split(":");
        int ltime = (Integer.parseInt(lasts[0]) - 17) * 3600 * 24 + (Integer.parseInt(lastss[0])) * 3600 + (Integer.parseInt(lastss[1])) * 60;

        List<String[]> res = new ArrayList<String[]>();
        List<Usermove> list = usermoveRepo.findByMdnAndTimeBetween(mdn,ftime,ltime);
        Map<String,String[]> b = new HashMap<String, String[]>();
        b.put("180****0821",new String[]{"121.3961","31.1403","121.3961","31.1403","闵行区 古美路街道","闵行区 古美路街道","退休/失业/自由工作者/家庭主妇（夫）","闵行区 古美路街道"," 闵行区 古美路街道"," 闵行区 古美路街道"," 徐汇区 康健新村街道"," 徐汇区 漕河泾新兴技术开发区","121.39608475207108"," 31.140352518921578"," 121.40265100760533"," 31.139392511203251"," 121.40156990599883"," 31.146155773128431"," 121.40600387701905"," 31.149287255966293"," 121.38941697586569"," 31.162258493179436"});
        b.put("180****0822",new String[]{"121.175823818","30.8598354176","121.17651","30.86247","金山区 朱泾镇","金山区 朱泾镇","退休/失业/自由工作者/家庭主妇（夫）","金山区 朱泾镇"," 金山区 朱泾镇"," 金山区 朱泾镇"," 金山区 朱泾镇"," 金山区 朱泾镇","121.176510436828"," 30.862381572994529"," 121.18139447643965"," 30.860593136942352"," 121.17602584047221"," 30.860324432888088"," 121.17950141578409"," 30.86138880126251"," 121.17821355407084"," 30.861905458063713"});
        b.put("133****0784",new String[]{"121.50137","31.19674","121.50137","31.19674","浦东新区 南码头路街道","浦东新区 南码头路街道","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 南码头路街道"," 浦东新区 南码头路街道"," 浦东新区 南码头路街道"," 浦东新区 南码头路街道"," 浦东新区 南码头路街道","121.50136994262709"," 31.196739982879613"," 121.50650997681973"," 31.195180006446577"," 121.50051890676211"," 31.196486029124912"," 121.50082491398211"," 31.196577343352295"," 121.4997929230134"," 31.196269391605369"});
        b.put("133****9204",new String[]{"121.480089826","31.2355599811","121.480089972","31.235559997","黄浦区 外滩街道","黄浦区 外滩街道","退休/失业/自由工作者/家庭主妇（夫）","黄浦区 外滩街道"," 黄浦区 外滩街道"," 黄浦区 外滩街道"," 黄浦区 外滩街道"," 黄浦区 外滩街道","121.48008997157443"," 31.235559996902595"," 121.48008982622784"," 31.235559981064878"," 121.48008986458063"," 31.235559985243995"," 121.48008999990716"," 31.235559999989881"," 121.48008977304629"," 31.235559975269929"});
        b.put("133****9044",new String[]{"121.35462","30.97364","121.46222","31.12722","徐汇区 华泾镇","徐汇区 华泾镇","normal worker","徐汇区 华泾镇"," 奉贤区 庄行镇"," 浦东新区 南汇新城镇"," 徐汇区 漕河泾街道"," 徐汇区 长桥街道","121.46135349808746"," 31.12789578607671"," 121.35481170123292"," 30.973887546602707"," 121.88385593026267"," 31.012843575001536"," 121.43738119831966"," 31.157610221323292"," 121.44925396570315"," 31.137417061621115"});
        b.put("177****5525",new String[]{"121.3379542","30.71244444","121.3379542","30.71244444","金山区 石化街道","金山区 石化街道","退休/失业/自由工作者/家庭主妇（夫）","金山区 石化街道"," 金山区 石化街道"," 金山区 石化街道"," 金山区 石化街道"," 金山区 石化街道","121.33795420318388"," 30.712444562425461"," 121.34199111102636"," 30.714614186731762"," 121.33895907805513"," 30.713429147500893"," 121.33956442875488"," 30.714011867254214"," 121.34054463462833"," 30.713846060200385"});
        b.put("180****1918",new String[]{"121.34665","31.11165","121.34665","31.11165","松江区 九亭镇","松江区 九亭镇","退休/失业/自由工作者/家庭主妇（夫）","松江区 九亭镇"," 闵行区 虹桥镇"," 闵行区 莘庄镇"," 闵行区 莘庄镇"," 闵行区 莘庄镇","121.34672733704583"," 31.111650162393865"," 121.37017630737232"," 31.178629725927127"," 121.34889805685631"," 31.100721103532063"," 121.36641411713339"," 31.121628646747549"," 121.37980909363208"," 31.109952717153234"});
        b.put("153****8116",new String[]{"121.4983","31.18942","121.4983","31.18942","浦东新区 周家渡街道","浦东新区 周家渡街道","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 周家渡街道"," 浦东新区 南码头路街道"," 浦东新区 周家渡街道"," 浦东新区 周家渡街道"," 浦东新区 周家渡街道","121.4983"," 31.189419999999998"," 121.51448000000001"," 31.194579999999998"," 121.50230582525865"," 31.186412580094576"," 121.50403076752202"," 31.184049687496586"," 121.50904420138045"," 31.177991164454887"});
        b.put("177****5065",new String[]{"121.4833889","31.26791667","121.4833889","31.26791667","虹口区 四川北路街道","虹口区 四川北路街道","退休/失业/自由工作者/家庭主妇（夫）","虹口区 四川北路街道"," 虹口区 四川北路街道"," 虹口区 四川北路街道"," 虹口区 四川北路街道"," 虹口区 四川北路街道","121.48338889999999"," 31.267916670000002"," 121.48044443044861"," 31.26840335029549"," 121.4820000006122"," 31.268146230264417"," 121.48279997838549"," 31.268014008225308"," 121.48183006805971"," 31.268174317080518"});
        b.put("180****0374",new String[]{"121.24275","31.03888","121.24275","31.03888","松江区 中山街道","松江区 中山街道","退休/失业/自由工作者/家庭主妇（夫）","松江区 中山街道"," 松江区 中山街道"," 松江区 中山街道"," 松江区 中山街道"," 松江区 中山街道","121.24274994929935"," 31.038880118500348"," 121.24082579526589"," 31.043377356947168"," 121.24048038783326"," 31.044184662162287"," 121.24023196689716"," 31.044765285212954"," 121.24066001557401"," 31.043759701679399"});
        b.put("180****6300",new String[]{"121.00774","30.89237","121.00774","30.89237","金山区 枫泾镇","金山区 枫泾镇","退休/失业/自由工作者/家庭主妇（夫）","金山区 枫泾镇"," 金山区 枫泾镇"," 金山区 枫泾镇"," 金山区 枫泾镇"," 金山区 枫泾镇","121.0077399689816"," 30.892369953761811"," 121.00725869225332"," 30.891652528953784"," 121.00699492566733"," 30.891259340001987"," 121.00739917449766"," 30.891861941628985"," 121.00710778222597"," 30.89142757189472"});
        b.put("153****9386",new String[]{"121.8610256","30.92488111","121.8610256","30.92488111","浦东新区 书院镇","浦东新区 书院镇","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 书院镇"," 浦东新区 书院镇"," 浦东新区 书院镇"," 浦东新区 书院镇"," 浦东新区 书院镇","121.86102570469764"," 30.924881244846766"," 121.86551585541316"," 30.926598900238616"," 121.85874858614842"," 30.926463699902435"," 121.86335658088903"," 30.927765331956071"," 121.86766766708838"," 30.927410141447048"});
        b.put("133****4246",new String[]{"121.620926746","31.2002003382","121.620926746","31.2002003382","浦东新区 张江高科技园区","浦东新区 张江高科技园区","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 张江高科技园区"," 浦东新区 张江高科技园区"," 浦东新区 张江高科技园区"," 浦东新区 张江高科技园区"," 浦东新区 唐镇","121.62087998991947"," 31.200183265991914"," 121.63273812779308"," 31.202850649015804"," 121.62184594833695"," 31.200397028058795"," 121.63339251946947"," 31.202916122523025"," 121.63596402676768"," 31.202435642386902"});
        b.put("180****3996",new String[]{"121.453750639","31.2497168137","121.4538333","31.2500833","闸北区 芷江西路街道","闸北区 芷江西路街道","退休/失业/自由工作者/家庭主妇（夫）","闸北区 芷江西路街道"," 闸北区 芷江西路街道"," 闸北区 天目西路街道"," 闸北区 芷江西路街道"," 闸北区 天目西路街道","121.45375074019569"," 31.249718086925704"," 121.45383259715385"," 31.250082743938993"," 121.45339839893292"," 31.249705037327747"," 121.45378103090064"," 31.249930233787389"," 121.4533886228522"," 31.250033235108528"});
        b.put("133****1529",new String[]{"121.502953","31.242163","121.502953","31.242163","浦东新区 陆家嘴街道","浦东新区 陆家嘴街道","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 陆家嘴街道"," 浦东新区 陆家嘴街道"," 浦东新区 陆家嘴街道"," 浦东新区 陆家嘴街道"," 浦东新区 陆家嘴街道","121.50295300017748"," 31.242162999830111"," 121.50792799306505"," 31.238987981958285"," 121.50178794543673"," 31.239110851030709"," 121.50005931513803"," 31.239159385357379"," 121.50095567779702"," 31.239127503152659"});
        b.put("189****7474",new String[]{"121.51508","31.29064","121.51508","31.29064","杨浦区 五角场镇","杨浦区 五角场镇","normal worker","杨浦区 五角场镇","","","","","121.51508000000001"," 31.290640000000003","","","","","","","",""});
        b.put("189****7474",new String[]{"121.33128","30.74028","121.33128","30.74028","金山区 山阳镇","金山区 山阳镇","退休/失业/自由工作者/家庭主妇（夫）","金山区 山阳镇","","","","","121.33128000000001"," 30.740279999999998","","","","","","","",""});
        b.put("189****6024",new String[]{"121.73285","31.05241","121.73285","31.05241","浦东新区 惠南镇","浦东新区 惠南镇","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 惠南镇"," 浦东新区 惠南镇"," 浦东新区 惠南镇"," 浦东新区 惠南镇"," 浦东新区 惠南镇","121.73285003143121"," 31.052409996879792"," 121.73402072319314"," 31.052293781314049"," 121.73348116404858"," 31.052347343808705"," 121.73373470648467"," 31.05232217443568"," 121.73326839741192"," 31.052368465333476"});
        b.put("177****7523",new String[]{"121.5826011","31.05524139","121.5826011","31.05524139","浦东新区 航头镇","浦东新区 航头镇","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇","121.5826011255603"," 31.055241419851907"," 121.58006278616796"," 31.057632361333184"," 121.58089355879055"," 31.056849812894956"," 121.58048669403874"," 31.057178834031372"," 121.58119602470664"," 31.05656490433655"});
        b.put("189****5739",new String[]{"121.36583","31.14853","121.36583","31.14853","闵行区 七宝镇","闵行区 七宝镇","退休/失业/自由工作者/家庭主妇（夫）","闵行区 七宝镇"," 闵行区 七宝镇"," 松江区 泗泾镇"," 松江区 九亭镇"," 闵行区 七宝镇","121.36572543678359"," 31.148543255478604"," 121.36552458207683"," 31.144914033123769"," 121.28042958390481"," 31.118338603393518"," 121.31677767577919"," 31.120437723824246"," 121.37193539554532"," 31.155023745750444"});
        b.put("180****4170",new String[]{"121.343649","30.826298","121.343649","30.826298","金山区 金山工业区","金山区 金山工业区","退休/失业/自由工作者/家庭主妇（夫）","金山区 金山工业区"," 金山区 金山工业区"," 金山区 漕泾镇"," 金山区 漕泾镇"," 奉贤区 柘林镇","121.34339070616554"," 30.82655717042163"," 121.34362350096275"," 30.822754651370079"," 121.37301977924746"," 30.83306818813837"," 121.34383789098413"," 30.811006027654521"," 121.42905269958328"," 30.833166568291375"});
        b.put("180****4239",new String[]{"121.334138662","30.8521067311","121.33253","30.84905","金山区 金山工业区","金山区 金山工业区","退休/失业/自由工作者/家庭主妇（夫）","金山区 金山工业区"," 金山区 金山工业区"," 松江区 车墩镇"," 松江区 中山街道"," 奉贤区 奉城镇","121.33325596994968"," 30.852370104627269"," 121.34226013611199"," 30.826817013592073"," 121.26581621901506"," 30.989317262499462"," 121.26671421266465"," 31.044352417242781"," 121.63313349320954"," 30.871685511078176"});
        b.put("133****4147",new String[]{"121.4211111","31.23284696","121.4211111","31.23194444","静安区 曹家渡街道","静安区 曹家渡街道","退休/失业/自由工作者/家庭主妇（夫）","静安区 曹家渡街道"," 静安区 曹家渡街道"," 静安区 曹家渡街道"," 静安区 曹家渡街道"," 静安区 曹家渡街道","121.42111315833591"," 31.231942805582001"," 121.42272009596302"," 31.232841700168606"," 121.42229117501691"," 31.232596842076973"," 121.42352728788848"," 31.233294430344213"," 121.42192717008372"," 31.232392788479356"});
        b.put("180****3364",new String[]{"121.33253","30.85409153","121.33253","30.85409153","金山区 金山工业区","金山区 金山工业区","退休/失业/自由工作者/家庭主妇（夫）","金山区 金山工业区"," 金山区 金山工业区"," 金山区 金山工业区"," 闵行区 莘庄工业区"," 松江区 车墩镇","121.33421512007649"," 30.852600635135943"," 121.32069467728219"," 30.848414853513837"," 121.34298889790169"," 30.826289979346296"," 121.37795740995099"," 31.05727131931166"," 121.30191091432877"," 30.998111052528234"});
        b.put("180****3459",new String[]{"121.56981","31.06729","121.56981","31.06729","浦东新区 航头镇","浦东新区 航头镇","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇"," 浦东新区 航头镇","121.58920596206126"," 31.061102724669503"," 121.56978242623671"," 31.06730323005203"," 121.57943515393923"," 31.067830385082974"," 121.57449753618387"," 31.062497015870264"," 121.59802999999999"," 31.068829999999998"});
        b.put("180****2344",new String[]{"121.3761","30.83082","121.343649","30.826298","金山区 漕泾镇","金山区 漕泾镇","normal worker","金山区 漕泾镇"," 金山区 金山工业区"," 浦东新区 航头镇"," 闵行区 江川路街道"," 奉贤区 柘林镇","121.37048684110859"," 30.831983121520864"," 121.33990366063897"," 30.830813561504431"," 121.57202353827176"," 31.06218392177302"," 121.33141952998415"," 30.988218033636446"," 121.4311936447275"," 30.828411805897932"});
        b.put("180****9379",new String[]{"121.3761","30.83082","121.343649","30.826298","金山区 漕泾镇","金山区 金山工业区","normal worker","金山区 漕泾镇"," 金山区 金山工业区"," 松江区 中山街道"," 金山区 亭林镇"," 奉贤区 柘林镇","121.37180227222636"," 30.831766792513534"," 121.34119836689156"," 30.825678717135364"," 121.27860537537899"," 31.049619068909649"," 121.32032718121891"," 30.879018338172816"," 121.42826043615194"," 30.833851401900919"});
        b.put("180****1432",new String[]{"121.3037644","30.71736667","121.3037644","30.71736667","金山区 石化街道","金山区 石化街道","退休/失业/自由工作者/家庭主妇（夫）","金山区 石化街道"," 金山区 石化街道"," 金山区 金山卫镇"," 金山区 金山工业区"," 金山区 金山卫镇","121.30383372608574"," 30.717438903554616"," 121.30495704350393"," 30.718390091870159"," 121.29787746371493"," 30.728439063629583"," 121.33655741292748"," 30.856717198866818"," 121.30841603909052"," 30.725681758139622"});
        b.put("189****1217",new String[]{"121.4532628","30.91583278","121.4532628","30.91583278","奉贤区 南桥镇","奉贤区 南桥镇","退休/失业/自由工作者/家庭主妇（夫）","奉贤区 南桥镇"," 奉贤区 南桥镇"," 奉贤区 南桥镇"," 奉贤区 南桥镇"," 奉贤区 南桥镇","121.45326340437165"," 30.915831550901089"," 121.45340759539053"," 30.915875828973245"," 121.45323283938384"," 30.915685343165762"," 121.45324945871749"," 30.915418079123484"," 121.45405613320348"," 30.916056354660146"});
        b.put("177****2368",new String[]{"121.7271","31.11071","121.7271","31.11071","浦东新区 川沙新镇","浦东新区 川沙新镇","退休/失业/自由工作者/家庭主妇（夫）","浦东新区 川沙新镇"," 浦东新区 川沙新镇"," 浦东新区 川沙新镇"," 浦东新区 川沙新镇"," 浦东新区 川沙新镇","121.72712062123823"," 31.110741619816892"," 121.72614130517611"," 31.111100844741106"," 121.72516950032386"," 31.111449170985608"," 121.72695942097438"," 31.113763636944004"," 121.72302602894172"," 31.112154704401128"});
        b.put("177****6675",new String[]{"121.310455911","31.1662131106","121.36546","31.16657","青浦区 徐泾镇","闵行区 虹桥镇","normal worker","青浦区 徐泾镇"," 闵行区 虹桥镇"," 闵行区 虹桥镇"," 闵行区 莘庄镇"," 闵行区 古美路街道","121.31115210236726"," 31.166577384998394"," 121.36573081474288"," 31.166185630704675"," 121.36837901781071"," 31.170110983779725"," 121.36165058932832"," 31.10921738687211"," 121.37033632738368"," 31.15903598277081"});
        b.put("180****9844",new String[]{"121.44809","31.24956","121.44809","31.24956","闸北区 天目西路街道","闸北区 天目西路街道","退休/失业/自由工作者/家庭主妇（夫）","闸北区 天目西路街道"," 闸北区 天目西路街道"," 闸北区 天目西路街道"," 闸北区 天目西路街道"," 闸北区 天目西路街道","121.44809078380105"," 31.249558768279993"," 121.44838683543232"," 31.249463960716302"," 121.44864985087503"," 31.249495148814219"," 121.44895747193826"," 31.249582450809168"," 121.44732265518263"," 31.249510812494474"});
        b.put("153****3853",new String[]{"121.44173","30.91983","121.44173","30.91983","奉贤区 南桥镇","奉贤区 南桥镇","退休/失业/自由工作者/家庭主妇（夫）","奉贤区 南桥镇"," 奉贤区 南桥镇"," 奉贤区 金汇镇"," 虹口区 提篮桥街道"," 奉贤区 南桥镇","121.4415807907106"," 30.921017968418894"," 121.42965218741008"," 30.99016991368083"," 121.5196471706065"," 30.978408393009971"," 121.48696414462604"," 31.252449240482516"," 121.43976686377806"," 30.96921287782283"});
        b.put("180****4167",new String[]{"121.30049","31.04689","121.4808633","30.8781","松江区 新桥镇","奉贤区 柘林镇","normal worker","松江区 新桥镇"," 闵行区 颛桥镇"," 松江区 车墩镇"," 闵行区 马桥镇"," 奉贤区 柘林镇","121.301319991246"," 31.046696817640637"," 121.39975343530331"," 31.078978873345179"," 121.30370957610914"," 31.016720448169437"," 121.35761546449073"," 31.016604668461898"," 121.49047253009506"," 30.879763667894679"});
        b.put("177****9170",new String[]{"121.516572","31.260573","121.48548","31.29005","杨浦区 平凉路街道","虹口区 曲阳路街道","normal worker","杨浦区 大桥街道"," 虹口区 曲阳路街道"," 杨浦区 平凉路街道"," 杨浦区 大桥街道"," 虹口区 四川北路街道","121.51914175494542"," 31.264718985786512"," 121.48555076792282"," 31.290049130030564"," 121.5165693493917"," 31.260574466907403"," 121.52102406699653"," 31.2650644884495"," 121.47798792466459"," 31.254213617709503"});
        b.put("181****2219",new String[]{"121.50484","31.26211","121.50484","31.26211","杨浦区 江浦路街道","杨浦区 江浦路街道","退休/失业/自由工作者/家庭主妇（夫）","杨浦区 江浦路街道"," 杨浦区 江浦路街道"," 杨浦区 江浦路街道"," 虹口区 提篮桥街道"," 虹口区 提篮桥街道","121.5048400847413"," 31.262111977610154"," 121.50386923406587"," 31.261506022297276"," 121.50599890462573"," 31.25988904767252"," 121.50181767353013"," 31.26307209604288"," 121.50248556001731"," 31.262563073012622"});
        b.put("153****0898",new String[]{"121.76886","31.10888","121.5152778","31.23061111","浦东新区 祝桥镇","浦东新区 陆家嘴街道","normal worker","浦东新区 陆家嘴街道"," 浦东新区 祝桥镇"," 浦东新区 祝桥镇"," 浦东新区 祝桥镇"," 浦东新区 川沙新镇","121.51520818625602"," 31.230621243972038"," 121.78031072901076"," 31.100006350179001"," 121.76860984718441"," 31.108101726868316"," 121.75379134718759"," 31.121726492133053"," 121.69594450991352"," 31.190288197969888"});
        String[] c = b.get(mdn);
        res.add(new String[]{c[0],c[1]});
        res.add(new String[]{c[2],c[3]});
        res.add(new String[]{c[4],c[5],c[6],c[7],c[8],c[9],c[10],c[11],c[12],c[13],c[14],c[15],c[16],c[17],c[18],c[19],c[20],c[21]});

        for (Usermove l :list) {
            res.add(new String[]{l.getLon()+"", l.getLat()+""});
        }

        return res;

    }
}
