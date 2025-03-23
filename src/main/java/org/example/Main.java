package org.example;

import static org.example.comment.Kouhan.callDeae;
import static org.example.comment.Kouhan.showMondokoro;
import static org.example.comment.Zenhan.doTogame;
import static org.example.comment.Zenhan.doWarusa;

import java.util.HashMap;
import java.util.Map;


//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {


    public static void main(String[] args)  {
      doWarusa();
      doTogame();
      callDeae();
      showMondokoro();
    }

}