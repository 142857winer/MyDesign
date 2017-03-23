package com.cqu.festival_sms.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
public class FestivalLab {

    public static FestivalLab mInstance;
    private List<Festival> mFestivals = new ArrayList<>();
    private List<Msg> mMsgs = new ArrayList<>();


    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "New Year"));
        mFestivals.add(new Festival(4, "Spring Festival"));
        mFestivals.add(new Festival(5, "端午节"));
        mFestivals.add(new Festival(6, "七夕节"));
        mFestivals.add(new Festival(7, "Christmas Day"));
        mFestivals.add(new Festival(8, "儿童节"));
        mFestivals.add(new Festival(9, "愚人节"));

        mMsgs.add(new Msg(1, 1, "装一袋阳光两把海风，自制了几斤祝福，托人到美国买了些快乐，法国买了两瓶浪漫，从心灵的深处切下几许关怀，作为礼物送给你，祝国庆快乐！"));
        mMsgs.add(new Msg(2, 1, "金秋十月，举国同庆；神州大地，繁花似锦；家和国盛，乐曲如潮，借着这伟大而美丽的日子送上我最诚挚的祝福：天天开心，事事顺意！"));
        mMsgs.add(new Msg(3, 1, "欢度国庆，举国同庆！在这美好日子里，让我用最真挚的祝福陪你度过！祝：万事大吉，心想事成，家和万事兴！国庆快乐！"));
        mMsgs.add(new Msg(4, 1, "平日工作实在劳累，国庆佳节阳光明媚，梳洗打扮做好准备，哥们姐们来个聚会，放心不会让你破费，买单基本确定AA."));
        mMsgs.add(new Msg(5, 1, "让短信带上问候乘着翅膀，在无限的扩大想像空间，将关怀友谊化作音符飞扬，让你享受另一番心情的温馨，给你献上朋友真诚的祝福：国庆快乐!"));
        mMsgs.add(new Msg(6, 1, "每一阵清风细雨，都会让我将你轻轻想起；每一条祝福短信，都会将我们的心靠得更近；恰逢国庆之际，借此送上我的真挚问候，愿你天天快乐！"));
        mMsgs.add(new Msg(7, 1, "毛主席说：身体是革命的本钱。所以，当你收到这条短信时，我只轻轻地说一句：身体是幸福的本钱，即使在假期，也要照顾好自己，祝你国庆节快乐！"));
        mMsgs.add(new Msg(8, 1, "旅客朋友们，欢迎乘坐Z101国庆号列车。本次列车开往幸福之门，准时到站时间是此刻，行驶历程为终生。欢迎您的乘坐，祝您旅途愉快，谢谢！"));
        mMsgs.add(new Msg(9, 1, "国庆要爱国，要喜庆。节日期间，凡不开心者、不微笑者、不吃好喝好者、不将自己的快乐传递给朋友者，一概以莫须有之罪名，剥夺郁闷权利终身！"));



        mMsgs.add(new Msg(1, 2, "中秋节预热：满满心意存我心间，只待月圆，为你祈祷为你祝福为你而活为你等待为你写诗为你求神拜佛为你改悲伤的神话故事，愿你合家团圆快乐永久！"));
        mMsgs.add(new Msg(2, 2, "一轮明月思悠悠，两地月光似水流，三生有幸做朋友，四季轮回到中秋，五福临门来送喜，六六大顺伴永久，七星伴月人欢乐，八仙桌上敬美酒。预祝中秋快乐。"));
        mMsgs.add(new Msg(3, 2, "月儿圆，月饼甜，举杯赏月心悠闲，品美酒，尝鲜果，吉祥喜庆身边卧，中秋夜，好热闹，祝福问候全送到，中秋佳节，愿你合家欢乐，日子‘月’来‘月’甜，事业‘月’来‘月’顺。"));
        mMsgs.add(new Msg(4, 2, "横看是圆侧也圆，远近高低圆不同，不识圆月真面目，只缘身在团圆中。中秋节祝你：锦上添花花更艳，事业家庭都圆满！"));
        mMsgs.add(new Msg(5, 2, "皎皎的天上月，圆圆的中秋节。脉脉星河稀，款款逢佳期。个个月饼香，片片桂花芳。依依思念至，遥遥祝福句：甜甜日子美，浓浓幸福随。中秋快乐！"));
        mMsgs.add(new Msg(6, 2, "晚风清，圆月明，今宵嫦娥舞娉婷；朋友在，亲人爱，快乐常随幸福来；佳节到，中秋闹，我的祝福少不了！祝你中秋合家团圆乐悠悠。"));
        mMsgs.add(new Msg(7, 2, "仰首花迎春，俯首叶知秋，抬头低头话中秋；月圆诗意兴，月缺意境浓，圆圆缺缺夜朦胧；问候浓如茶，祝福香如酒，茶浓酒香添盈袖。中秋节，愿你幸福依旧"));
        mMsgs.add(new Msg(8, 2, "月是中秋分外明，祝你天天好心情，皓月当空洒清辉，美好事儿一堆堆；祝愿佳节多喜庆，以后天天走好运，中秋节快乐！"));
        mMsgs.add(new Msg(9, 2, "中秋送你五轮大圆月：薪水年年大超“月”，人气飙升大跨“月”，健康指数大翻“月”，生活幸福好优“月”，天天开心真愉“月”。中秋快乐！"));


        mMsgs.add(new Msg(1, 3, "To wish you joy at this holy season. Wishing every happiness will always be with you."));
        mMsgs.add(new Msg(2, 3, "Allow me to congratulate you on the arrival of the New Year and to extend to you all my best wishes for your perfect health and lasting prosperity."));
        mMsgs.add(new Msg(3, 3, "May your New Year be filled with special moment, warmth, peace and happiness, the joy of covered ones near, and wishing you all the joys of Christmas and a year of happiness."));
        mMsgs.add(new Msg(4, 3, "A New year greeting to cheer you from your daughter."));
        mMsgs.add(new Msg(5, 3, "Warmest thoughts and best wishes from your daughter. "));
        mMsgs.add(new Msg(6, 3, "　Mom and Dad: Thank you for everything this holiday season!"));


        mMsgs.add(new Msg(1, 4, "On this special day I send you New Years greetings and hope that some day soon we shall be together. "));
        mMsgs.add(new Msg(2, 4, "To wish you joy at this holy season. Wishing every happiness will always be with you."));
        mMsgs.add(new Msg(3, 4, "Allow me to congratulate you on the arrival of the New Year and to extend to you all my best wishes for your perfect health and lasting prosperity."));
        mMsgs.add(new Msg(4, 4, "I would like to wish you a joyous new year and express my hope for your happiness and good future."));
        mMsgs.add(new Msg(5, 4, "Take good care of yourself in the year ahead."));
        mMsgs.add(new Msg(6, 4, "I would like to wish you a joyous new year and express my hope for your happiness and good future."));
        mMsgs.add(new Msg(7, 4, "On this special day I send you New Year's greetings and hope that some day soon we shall be together."));
        mMsgs.add(new Msg(8, 4, "Rich blessings for health and longevity is my special wish for you in the coming year."));


        mMsgs.add(new Msg(1, 5, "愿幸福就像一根粽绳，紧紧地缠住你；愿快乐就像一片片粽叶，团团地围住你；美满就像一阵阵粽香，久久地环绕你。衷心祝你端午节幸福、快乐、美满！"));
        mMsgs.add(new Msg(2, 5, "一笼香香的粽子、一缕淡淡的清香、一心深情的祝福、一年真情的想念、一生真心的朋友。端午节到了，祝你节日快乐，全家幸福安康！"));
        mMsgs.add(new Msg(3, 5, "端午到，送您一个香甜的粽子，以芬芳的祝福为叶，以宽厚和包容为米，以温柔的叮咛做馅，再用友情的丝线缠绕，愿您品味出人生的美好，祝端午节快乐！"));
        mMsgs.add(new Msg(4, 5, "艾叶扬，粽子尝，欣然佳节逢端阳；佩香囊，饮雄黄，豪情龙舟争渡忙；情意长，蜜如糖，朋友祝福到身旁：愿吉祥，祈安康，快乐幸福你珍藏。"));
        mMsgs.add(new Msg(5, 5, "端午节到了，我按键敲下了我一行行的祝福，千言万语化成了这一条短信的祝福：亲爱的朋友，端午节祝你幸福快乐！"));
        mMsgs.add(new Msg(6, 5, "五月初五是端阳，阳光灿烂粽飘香，甜甜的米儿口中嚼，幸福的就在你心上，香香的肉儿肚里藏，你的财气一个劲的向上涨，粽子香，粽子美，端阳节祝你快乐找不到北。"));
        mMsgs.add(new Msg(7, 5, "短信息一条十分简单快乐，包含祝福一串串：端午节到了，祝快快乐乐，开开心心;健健康康，轻轻松松;团团圆圆，恩恩爱爱;和和美美，红红火火!"));
        mMsgs.add(new Msg(8, 5, "想念你的微笑，回味你的味道，脱掉你的外套，露出你的美妙，压抑我的狂躁，想想我的需要，还是早点把你干掉…啊，粽子！端午快乐！"));
        mMsgs.add(new Msg(9, 5, "米饭和包子打群架，米饭仗着人多见到长得象包子的都打，包子、饺子和汤圆无一幸免，一个粽子被逼到墙角，情急之下它脱了衣服喊：我是卧底......"));


        mMsgs.add(new Msg(1, 6, "爱情就像电视剧，不同的是它只有现场直播，没有预知，也没有重播。所以这场故事里的主角，永远都只有我和你。七夕节快要到了，愿我们一起用爱，谱写一段唯美的恋曲，缘定三生，永永远远不分离。"));
        mMsgs.add(new Msg(2, 6, "七夕情人节将至，七情六欲泛滥，七个情人要“摆平”：巩固老情人，联络旧情人，发展新情人，保育大情人，栽培小情人，寻找多情人，提防知情人！"));
        mMsgs.add(new Msg(3, 6, "点点星光点点爱，点点雨滴润情怀，点点笔尖千万语，点点爱慕集成海。愿这点点的话语，让你有点点的悸动，预祝七夕节快乐幸福陪你常在！"));
        mMsgs.add(new Msg(4, 6, "爱是一种感受，即使痛苦也觉得幸福；爱是一种缘分，即使分离也觉得心醉；爱是一种体会，即使心碎也觉得甜蜜；七夕将临，愿心爱的人快乐幸福！"));
        mMsgs.add(new Msg(5, 6, "今生与你相识，再无遗憾；今朝和你相知，三生有幸；今世你我相恋，缘分已定；七夕到了，今宵有你陪伴，我的世界灿烂一片。亲爱的，我陪你过七夕。"));
        mMsgs.add(new Msg(6, 6, "在不知不觉中就把心交给了你，从此我再也不是我自己，只是又多了一个你，一个永远爱着你的你。爱无需太多言语，七夕节快到了，愿我们的爱情最美丽。"));

        mMsgs.add(new Msg(1, 7, "christmas may be many things or it may be a few. for you, the joy is each new toy; for me; it's watching u. "));
        mMsgs.add(new Msg(2, 7, "two things upon this changing earth can neither change nor end; the splendor of christ's humble birth, the love of friend for friend."));
        mMsgs.add(new Msg(3, 7, "ur friendship is a glowing ember through the yr n each december frm its warm n livin spark v kindle flame against da dark n with its shining radiance light our tree of faith on christmas night."));
        mMsgs.add(new Msg(4, 7, "can i have your picture, so santa claus knows exactly what to give me. happy christmas."));
        mMsgs.add(new Msg(5, 7, "if one night a big fat man jumps in at your window, grabs you and puts you in a sack don't worry i told santa i wanted you for christmas.happy christmas "));
        mMsgs.add(new Msg(6, 7, "lets welcome the year which is fresh lets welcome the year which is fresh and new,lets cherish each moment it beholds, lets celebrate this blissful new year. merry x-mas"));


        mMsgs.add(new Msg(1, 8, "保持童心，事事开心；保持童真，时时欢心；心态纯真，迎来好运；童稚再现，幸福连连；童趣不断，快乐来缠，六一儿童节到了，祝超龄儿童，节日快乐。"));
        mMsgs.add(new Msg(2, 8, "“六”一点童心，快乐无穷无尽；“六”一点童真，待人无比热忱；“六”一点童趣，开心时时欢聚；“六”一点童年，美好永驻心间！“六一”儿童节，祝你快乐无边，幸福永远！"));
        mMsgs.add(new Msg(3, 8, "跳房子，堆沙子，橡皮绳，翻纸片，好多童年美好的回忆，千万不要忘记。就算时间不能倒退，我们回不到过去，但是想想快乐的事情，儿童节一起偷着乐吧"));
        mMsgs.add(new Msg(4, 8, "儿童节，送礼忙！送你块“快乐糖”，甜蜜口中尝；送你面“幸运旗”，机遇手中扬；送你根“祝福棒”，如意心中享！别只顾收礼，记得把祝福发扬！"));
        mMsgs.add(new Msg(5, 8, "今天儿童节，不要局限在咬手指尿裤子的小孩游戏中，来玩点成年人的高级游戏：我唱二百首歌，你跳二百支舞。记住哦，我是二百歌，你是二百舞。六一愉快 "));
        mMsgs.add(new Msg(6, 8, "六一节了，重回童年的记忆。好怀念，你那性感的开裆裤，你那鼻涕当面膜的厚脸皮，你哭笑转换自如的演技，撒气泼来地上蹭个坑的耐力。愿你永葆童心！"));


        mMsgs.add(new Msg(1, 9, "今天对你说实话，心中早已有个她。美丽温柔又善良，在我心中很久啦。如今我俩快结婚，幸福生活成一家。别怕别怕大傻瓜，你就是我心中的她。祝愚人节快乐！"));
        mMsgs.add(new Msg(2, 9, "今天愚人节，你可要当心；朋友有坏心，整你当开心；有人发好心，别当做真心；时时要留心，刻刻要小心；送你一份关心，愿你今天安心。祝愚人节快乐顺心！"));
        mMsgs.add(new Msg(3, 9, "愚人节有一个最令人发指的功能，那就是把自己的快乐建立在别人的犯傻上。但今天我不会启用这个功能，因为。你已经在傻乐了！愚人节快乐！"));
        mMsgs.add(new Msg(4, 9, "愚人节给你放假一天，工资涨一倍，旅游有报销，买货不花钱，如花姑娘向你笑，只有小猪才会看我的这条短信，我祝你这个小猪（愚蠢的人）节日快乐，梦想成真。"));
        mMsgs.add(new Msg(5, 9, "愚人节来到，当心被整到；出门小心防熟人，公司谨慎防同事；美女放电要回避，朋友热情要注意，在愚人节开心伴好运，快乐每一秒！"));
        mMsgs.add(new Msg(6, 9, "愚人节到心紧张，害怕中招被人愚。处处小心又谨慎，别人说话心思量。生怕不慎被人愚，举止不当出洋相。我劝朋友心放宽，莫把被愚放心上。哈哈一笑人轻松，生活快乐情谊长。祝愚人节快乐！"));
    }

    /**
     * 返回的是某一类消息Id的全部消息,例如返回所有笑话的短信集合
     *
     * @param fesId
     * @return
     */
    public List<Msg> getMsgsByFestivalId(int fesId) {
        List<Msg> msgs = new ArrayList<>();
        for (Msg msg : mMsgs) {
            if (msg.getFestivaId() == fesId) {
                msgs.add(msg);
            }
        }
        return msgs;
    }

    public Msg getMsgByMsgId(int id) {
        for (Msg msg : mMsgs) {
            if (msg.getId() == id) {
                return msg;
            }
        }
        return null;
    }


    public List<Festival> getmFestivals() {
        return new ArrayList<Festival>(mFestivals);
    }

    public Festival getmFestivalById(int fesId) {
        for (Festival festival : mFestivals) {
            if (festival.getId() == fesId) {
                return festival;
            }
        }
        return null;
    }

    public static FestivalLab getmInstance() {
        if (mInstance == null) {
            synchronized (FestivalLab.class) {
                if (mInstance == null) {
                    mInstance = new FestivalLab();
                }
            }
        }
        return mInstance;
    }


}
