package com.jmqstudio.strlantian.Factory;

import com.jmqstudio.strlantian.Orientation.CreatePage;
import org.bukkit.inventory.Inventory;

import static com.jmqstudio.strlantian.Factory.Items.*;
import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class GUI
{
    public static Inventory pg1 = CreatePage.createViewPage(PG1T);
    public static Inventory pg2 = CreatePage.createViewPage(PG2T);
    public static Inventory pg3 = CreatePage.createViewPage(PG3T);
    public static Inventory pg4 = CreatePage.createViewPage(PG4T);
    static
    {
        pg1.setItem(10, appHel);
        pg1.setItem(11, appSwo);
        pg1.setItem(12, appBow);
        pg1.setItem(13, appShield);
        pg1.setItem(14, vpSwo);
        pg1.setItem(15, sharpB);
        pg1.setItem(16, powB);
        pg1.setItem(19, dragSwo);
        pg1.setItem(20, protB);
        pg1.setItem(21, projB);
        pg1.setItem(22, dragChe);
        pg1.setItem(23, dust);
        pg1.setItem(24, wart);
        pg1.setItem(25, nec);
        pg1.setItem(28, netArt);
        pg1.setItem(29, steak);
        pg1.setItem(30, tou);
        pg1.setItem(31, spkChe);
        pg1.setItem(32, sevBot);
        pg1.setItem(33, ipk);
        pg1.setItem(34, obs);

        pg2.setItem(10, tarn);
        pg2.setItem(11, fortPic);
        pg2.setItem(12, exp);
        pg2.setItem(13, ltEnc);
        pg2.setItem(14, ltAnv);
        pg2.setItem(15, thoB);
        pg2.setItem(16, wisA);
        pg2.setItem(19, melon);
        pg2.setItem(20, aspPt);
        pg2.setItem(21, gApple);
        pg2.setItem(22, hd);
        pg2.setItem(23, pBox);
        pg2.setItem(24, panP);
        pg2.setItem(25, cBow);
        pg2.setItem(28, arrow);
        pg2.setItem(29, sad);
        pg2.setItem(30, velPt);
        pg2.setItem(31, fer);
        pg2.setItem(32, forge);
        pg2.setItem(33, qkPic);
        pg2.setItem(34, lum);

        pg3.setItem(10, eBook);
        pg3.setItem(11, gpk);
        pg3.setItem(12, sug);
        pg3.setItem(13, chest);
        pg3.setItem(14, fs);
        pg3.setItem(15, shear);
        pg3.setItem(16, dep);
        pg3.setItem(19, frs);
        pg3.setItem(20, caBo);
        pg3.setItem(21, atm);
        pg3.setItem(22, harm);
        pg3.setItem(23, exu);
        pg3.setItem(24, leg);
        pg3.setItem(25, fateB);
        pg3.setItem(28, drAxe);
        pg3.setItem(29, ex);
        pg3.setItem(30, and);
        pg3.setItem(31, scy);
        pg3.setItem(32, fate);
        pg3.setItem(33, horn);
        pg3.setItem(34, ess);

        pg4.setItem(10, ext);
        pg4.setItem(11, vBox);
        pg4.setItem(12, dice);
        pg4.setItem(13, rod);
        pg4.setItem(14, ske);
        pg4.setItem(15, vid);
        pg4.setItem(16, val);
        pg4.setItem(19, bls);
        pg4.setItem(20, amb);
        pg4.setItem(21, lus);
        pg4.setItem(22, all);
        pg4.setItem(23, eps);
        pg4.setItem(24, spd);
        pg4.setItem(25, rage);
        pg4.setItem(28, ft);
        pg4.setItem(29, flint);
        pg4.setItem(30, cpk);
        pg4.setItem(31, egApple);
        pg4.setItem(32, ht);
        pg4.setItem(33, stick);
    }
}
