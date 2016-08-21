package maa.test.plugin.ExPlugin;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
	public void onEnable() {
        getLogger().info("起動時のメッセージ");
        this.getServer().getPluginManager().registerEvents(this, this);
        Map<UUID, Player> as=Server.getInstance().getOnlinePlayers();//オンラインのプレイヤーを取得(Mapの形式で返されます)
        System.out.println(as.size());//phpでの.lengthみたいなので数数える(オンラインのプレイヤーの人数を調べられる)
        new Thread(new Runnable() {
            @Override
            public void run() {
                //別スレッドで実行する内容
            }
        }).start();

}

}
