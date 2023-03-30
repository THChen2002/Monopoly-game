package fianal_project;
import java.util.Scanner;

public class monopoly {

	//玩家棋子和土地房子圖示
	public static String symbol[] = {"1", "2", "3", "4", "   ", " ■ ", " ▲ ", "▲▲ ", "▲▲▲"};
	
	//國家名字和機會(?)命運(!)標示
	public static String country_name[] = {"Start", "KOR", " ! ", "JPN", "MEX", " ? ", "NZL", "Toilet", "USA", "RUS", "Back", "SGP", " ! ", "ESP", "THA", " ? ", "AUS", "Park", "TUR", "TWN"};
	
	//遊戲規則說明
	public static void rule() {
		System.out.println("歡迎來到大富翁環遊世界之旅\n");
		System.out.println("遊戲模式:\n1.有4位玩家(分別以1、2、3、4代表)\n2.每人初始金額:5000\n");
		System.out.println("功能:\n1.擲骰子\n2.購買土地or蓋房子\n3.機會、命運\n4.四個特殊角落格:起點獎勵、回到起點、休息"
							+ "\n5.顯示玩家(持有金額、已購買的土地、房子)和國家資訊(購買的價錢和過路費)\n");
		System.out.println("玩家可選擇動作:\n購買土地(以■代表)or蓋房子(最多可以蓋到三棟，以▲、▲▲、▲▲▲代表)\n");
		System.out.println("遊戲結束:\n如果有1人破產則遊戲結束，並依據剩餘金額列出排名\n");
	}
	
	//國家土地和房子費用及過路費
	public static void country_information(int countryinformation[][]) {
		
		/*[0][i]買土地的錢		[4][i]買土地的過路費
		 *[1][i]蓋一棟房子的錢	[5][i]蓋一棟房子的過路費
		 *[2][i]蓋兩棟房子的錢	[6][i]蓋兩棟房子的過路費
		 *[3][i]蓋三棟房子的錢	[7][i]蓋三棟房子的過路費
		 */
		
		//start
		countryinformation[0][0] = 1500;
		
		//KOR
		//cost
		countryinformation[0][1] = 2200;
		countryinformation[1][1] = 800;
		countryinformation[2][1] = 1500;
		countryinformation[3][1] = 3000;
		//fee
		countryinformation[4][1] = 880;
		countryinformation[5][1] = 1280;
		countryinformation[6][1] = 1630;
		countryinformation[7][1] = 2380;
		
		//JPN
		//cost
		countryinformation[0][3] = 2400;
		countryinformation[1][3] = 1000;
		countryinformation[2][3] = 1800;
		countryinformation[3][3] = 3500;
		//fee
		countryinformation[4][3] = 960;
		countryinformation[5][3] = 1460;
		countryinformation[6][3] = 1860;
		countryinformation[7][3] = 2710;
		
		//MEX
		//cost
		countryinformation[0][4] = 3000;
		countryinformation[1][4] = 1300;
		countryinformation[2][4] = 2400;
		countryinformation[3][4] = 4200;
		//fee
		countryinformation[4][4] = 1200;
		countryinformation[5][4] = 1850;
		countryinformation[6][4] = 2400;
		countryinformation[7][4] = 3300;
		
		//NZL
		//cost
		countryinformation[0][6] = 3600;
		countryinformation[1][6] = 1500;
		countryinformation[2][6] = 2800;
		countryinformation[3][6] = 5500;
		//fee
		countryinformation[4][6] = 1440;
		countryinformation[5][6] = 2190;
		countryinformation[6][6] = 2840;
		countryinformation[7][6] = 4190;
		
		//USA
		//cost
		countryinformation[0][8] = 2200;
		countryinformation[1][8] = 800;
		countryinformation[2][8] = 1500;
		countryinformation[3][8] = 3000;
		//fee
		countryinformation[4][8] = 880;
		countryinformation[5][8] = 1280;
		countryinformation[6][8] = 1630;
		countryinformation[7][8] = 2380;
		
		//RUS
		//cost
		countryinformation[0][9] = 1000;
		countryinformation[1][9] = 500;
		countryinformation[2][9] = 800;
		countryinformation[3][9] = 1500;
		//fee
		countryinformation[4][9] = 400;
		countryinformation[5][9] = 650;
		countryinformation[6][9] = 800;
		countryinformation[7][9] = 1150;
		
		//SGP
		//cost
		countryinformation[0][11] = 3000;
		countryinformation[1][11] = 1300;
		countryinformation[2][11] = 2400;
		countryinformation[3][11] = 4200;
		//fee
		countryinformation[4][11] = 1200;
		countryinformation[5][11] = 1900;
		countryinformation[6][11] = 2400;
		countryinformation[7][11] = 3300;
		
		//ESP
		//cost
		countryinformation[0][13] = 1600;
		countryinformation[1][13] = 900;
		countryinformation[2][13] = 1900;
		countryinformation[3][13] = 3700;
		//fee
		countryinformation[4][13] = 640;
		countryinformation[5][13] = 1090;
		countryinformation[6][13] = 1590;
		countryinformation[7][13] = 2490;
		
		//THA
		//cost
		countryinformation[0][14] = 2000;
		countryinformation[1][14] = 700;
		countryinformation[2][14] = 1400;
		countryinformation[3][14] = 2900;
		//fee
		countryinformation[4][14] = 800;
		countryinformation[5][14] = 1150;
		countryinformation[6][14] = 1500;
		countryinformation[7][14] = 2250;
		
		//AUS
		//cost
		countryinformation[0][16] = 2400;
		countryinformation[1][16] = 1000;
		countryinformation[2][16] = 1800;
		countryinformation[3][16] = 3500;
		//fee
		countryinformation[4][16] = 960;
		countryinformation[5][16] = 1460;
		countryinformation[6][16] = 1860;
		countryinformation[7][16] = 2710;
		
		//TUR
		//cost
		countryinformation[0][18] = 2200;
		countryinformation[1][18] = 800;
		countryinformation[2][18] = 1500;
		countryinformation[3][18] = 3000;
		//fee
		countryinformation[4][18] = 880;
		countryinformation[5][18] = 1280;
		countryinformation[6][18] = 1630;
		countryinformation[7][18] = 2300;
		
		//TWN
		//cost
		countryinformation[0][19] = 4000;
		countryinformation[1][19] = 1800;
		countryinformation[2][19] = 3200;
		countryinformation[3][19] = 6000;
		//fee
		countryinformation[4][19] = 160;
		countryinformation[5][19] = 2500;
		countryinformation[6][19] = 3200;
		countryinformation[7][19] = 4600;
	}
	
	//print地圖
	public static void print_map(String chess[][], String house[][]) {
		System.out.println();
		System.out.println("  ┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────────┐");
		System.out.println("  │ " + "       " + " │ " + house[0][1] + " │   " + "  │ " + house[0][3] + " │ " + house[0][4] + " │   " + "  │ " + house[0][6] + " │  "  + "Toilet" + " " + "│");
		System.out.println("  │  Start  ├─────┼─────┼─────┼─────┼─────┼─────┤  Pause  │");
		System.out.println("  │ +$3000  │ KOR │  !  │ JPN │ MEX │  ?  │ NZL │    1    │");
		System.out.println("  │  → → →  │$2200│     │$2400│$3000│     │$3600│  Round  │");
		System.out.println("  │ " + " " + "  " + chess[0][0] + chess[1][0] + chess[2][0] + chess[3][0] + " │" + chess[0][1] + chess[1][1] + chess[2][1] + chess[3][1] +" │" +  chess[0][2] + chess[1][2] + chess[2][2] + chess[3][2] + " │" +  chess[0][3] + chess[1][3] + chess[2][3] + chess[3][3] + " │" +  chess[0][4] + chess[1][4] + chess[2][4] + chess[3][4] + " │" +  chess[0][5] + chess[1][5] + chess[2][5] + chess[3][5] + " │" +  chess[0][6] + chess[1][6] + chess[2][6] + chess[3][6] + " │" +  chess[0][7] + chess[1][7] + chess[2][7] + chess[3][7] + "     " + "│");
		System.out.println("  ├───┬─────┼─────┴─────┴─────┼─────┴─────┴─────┼─────┬───┤");
		System.out.println("  │   │ TWN │                 │                 │ USA │   │");
		System.out.println("  │   │$4000│                 │                 │$2200│   │");
		System.out.println("  │" + house[0][19] + "│" +  chess[0][19] + chess[1][19] + chess[2][19] + chess[3][19] + " │     " + " Chance  " + "   │" + " Community chest " + "│" +  chess[0][8] + chess[1][8] + chess[2][8] + chess[3][8] + " │" + house[0][8] + "│");
		System.out.println("  ├───┼─────┤        ?        │         !       ├─────┼───┤");
		System.out.println("  │   │ TUR │                 │                 │ RUS │   │");
		System.out.println("  │   │$2200│                 │                 │$1000│   │");
		System.out.println("  │" + house[0][18] + "│" +  chess[0][18] + chess[1][18] + chess[2][18] + chess[3][18] + " │ " + "       X       " + " │ " + "       Y       " + " │" +  chess[0][9] + chess[1][9] + chess[2][9] + chess[3][9] + " │" + house[0][9] + "│");
		System.out.println("  ├───┴─────┼─────┬─────┬─────┼─────┬─────┬─────┼─────┴───┤");
		System.out.println("  │ " + " " + "  " +  chess[0][17] + chess[1][17] + chess[2][17] + chess[3][17] + " │" +  chess[0][16] + chess[1][16] + chess[2][16] + chess[3][16] + " │" +  chess[0][15] + chess[1][15] + chess[2][15] + chess[3][15] + " │" +  chess[0][14] + chess[1][14] + chess[2][14] + chess[3][14] + " │" +  chess[0][13] + chess[1][13] + chess[2][13] + chess[3][13] + " │" +  chess[0][12] + chess[1][12] + chess[2][12] + chess[3][12] + " │" +  chess[0][11] + chess[1][11] + chess[2][11] + chess[3][11] + " │" +  chess[0][10] + chess[1][10] + chess[2][10] + chess[3][10] + "     "  + "│");
		System.out.println("  │   Park  │ AUS │     │ THA │ ESP │     │ SGP │  Back   │");
		System.out.println("  │  Break  │$2400│  ?  │$2000│$1600│  !  │$3000│  To     │");
		System.out.println("  │    2    ├─────┼─────┼─────┼─────┼─────┼─────┤  Start  │");
		System.out.println("  │  " + "Round" + "  │ " + house[0][16] + " │   " + "  │ " + house[0][14] + " │ " + house[0][13] + " │   " + "  │ " + house[0][11] + " │ " + "        "  + "│");
		System.out.println("  └─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────────┘");
	}
	
	//print玩家資訊:持有金額、有土地或蓋房子的國家
	public static void print_player_informaiton(String player_information[][], int money[], int turn) {
		System.out.println();
		System.out.println("你現在所持有的金額:" + money[turn]);
		System.out.println("你現在所持有的土地:" + player_information[turn][0]);
		System.out.println("你現在蓋一棟房子的國家:" + player_information[turn][1]);
		System.out.println("你現在蓋兩棟房子的國家:" + player_information[turn][2]);
		System.out.println("你現在蓋三棟房子的國家:" + player_information[turn][3]);
		System.out.println();
	}

	//棋子移動
	public static void chess_move(String chess[][], int chessposition[], int turn, String symbol) {
		int dice = (int)(Math.random()*6+1);
		System.out.println("骰子點數為" + dice + "，前進" + dice + "步!");
		
		//turn:玩家順序 0是玩家1，1是玩家2，2是玩家3，3是玩家4
		chess[turn][chessposition[turn]] = " ";//將棋子從原來位置拿走
		chessposition[turn] += dice;
		
		//chessposition(棋子位置):0~19，如果超過19就要-20
		if (chessposition[turn] > 19) {
			chessposition[turn] -=20 ;
		}
		chess[turn][chessposition[turn]] = symbol;//將棋子放入新位置
	}

	//判斷此格土地是否已被購買、土地擁有者是自己還是他人，如果擁有者是自己也可升級房子
	public static boolean check_house(int chessposition[], String house[][], int turn) {
		//如果土地是自己的，boolean值為true
		boolean has_house_been_bought = true;
		
		//house[0][chessposition[turn]]:土地目前模樣，在此用來確認土地是否為空地
		//house[1][chessposition[turn]]:土地擁有權，放入turn來表示土地是誰的
		if ((house[0][chessposition[turn]] == "   ") || Integer.parseInt(house[1][chessposition[turn]]) == turn) { //強制將String轉成int
			has_house_been_bought = true;
		}else {
			has_house_been_bought = false;
		}
			
		return(has_house_been_bought);
	}
	
	//購買土地或蓋房子
	public static void buy_house(String chess[][], int chessposition[], int turn, String house[][], int money[], int countryinformation[][], String player_information[][], String houserank[][][]) {
		
			for (int i = 0; i <= 3; i++) {
				if (money[turn] >= countryinformation[i][chessposition[turn]]) { //如果錢夠多
					if (house[0][chessposition[turn]] == symbol[4+i]) {
						house[1][chessposition[turn]] = turn+""; //強制將int轉成String
						house[0][chessposition[turn]] = symbol[5+i];
						money[turn] -= countryinformation[i][chessposition[turn]];
						for (int j = 5; j <= 8; j++) {
							if (player_information[turn][i] == "目前沒有") {
								player_information[turn][i] = "";
							}
							if (house[0][chessposition[turn]] == symbol[5]) { //symbol[5]:" ■ "(土地)
								//houserank[i][j][k] i放入turn，代表玩家 j代表房子階級 k放入chessposition[turn]，代表國家
								houserank[turn][0][chessposition[turn]] = country_name[chessposition[turn]] + " "; //在houserank放入國家名
							}
							else if (house[0][chessposition[turn]] == symbol[j]) { //symbol[j]:有蓋房子
								//如果玩家蓋新房子，ex:蓋一棟房子
								houserank[turn][j-6][chessposition[turn]] = ""; //將國家名從舊陣列(土地)拿出
								houserank[turn][j-5][chessposition[turn]] = country_name[chessposition[turn]] + " "; //將國家名放入新陣列(一棟房子)
							}
						}
						for (int k = 0; k <= 3; k++) {
							if (player_information[turn][k] != "目前沒有") {
								player_information[turn][k] = "";
								for (int m = 0; m <= 19; m++) {
									//將houserank陣列裡的國家名照順序放入player_information陣列，之後要print出來
									player_information[turn][k] = player_information[turn][k] + houserank[turn][k][m];
								}
								//如果player_information陣列裡沒有國家名，則放"目前沒有"
								if (player_information[turn][k] == "") {
									player_information[turn][k] = "目前沒有";
								}
							}
						}
					}
					else {
						continue;
					}
					System.out.println("恭喜你成功購買土地");
					break;
				}
				else {
					System.out.println("你的錢不夠買呦!");
					break;
				}
			}
	}
	
	//國家買土地或蓋房子的費用資訊卡
	public static void country_cards_cost(int chessposition[], int turn, int countryinformation[][]) {
		System.out.println("以下為此國家買土地或蓋房子的資訊卡");
		
		System.out.println("  ┌──────────────┐");
		System.out.println("  │    "+ country_name[chessposition[turn]]+" cost  │");
		if (countryinformation[0][chessposition[turn]] >= 1000) {
			System.out.println("  │ land   $"+ countryinformation[0][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ land   $"+ countryinformation[0][chessposition[turn]] +"  │");
		}
		if(countryinformation[1][chessposition[turn]] >=1000) {
			System.out.println("  │ House1 $"+ countryinformation[1][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House1 $"+ countryinformation[1][chessposition[turn]] +"  │");
		}
		if(countryinformation[2][chessposition[turn]] >=1000) {
			System.out.println("  │ House2 $"+ countryinformation[2][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House2 $"+ countryinformation[2][chessposition[turn]] +"  │");
		}
		if(countryinformation[3][chessposition[turn]] >=1000) {
			System.out.println("  │ House3 $"+ countryinformation[3][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House3 $"+ countryinformation[3][chessposition[turn]] +"  │");
		}
		System.out.println("  └──────────────┘");
		
	}
	
	//國家的過路費資訊卡
	public static void country_cards_fee(int chessposition[], int turn, int countryinformation[][]) {
		System.out.println("以下為此國家的過路費資訊卡");
		
		System.out.println("  ┌──────────────┐");
		System.out.println("  │    "+ country_name[chessposition[turn]]+" fee   │");
		if (countryinformation[4][chessposition[turn]] >= 1000) {
			System.out.println("  │ land   $"+ countryinformation[4][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ land   $"+ countryinformation[4][chessposition[turn]] +"  │");
		}
		if(countryinformation[5][chessposition[turn]] >=1000) {
			System.out.println("  │ House1 $"+ countryinformation[5][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House1 $"+ countryinformation[5][chessposition[turn]] +"  │");
		}
		if(countryinformation[6][chessposition[turn]] >=1000) {
			System.out.println("  │ House2 $"+ countryinformation[6][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House2 $"+ countryinformation[6][chessposition[turn]] +"  │");
		}
		if(countryinformation[7][chessposition[turn]] >=1000) {
			System.out.println("  │ House3 $"+ countryinformation[7][chessposition[turn]] +" │");
		}
		else {
			System.out.println("  │ House3 $"+ countryinformation[7][chessposition[turn]] +"  │");
		}
		System.out.println("  └──────────────┘");
		
	}
	
	//機會
	public static void chance_cards(int money[], String chess[][], int chessposition[], int turn, String house[][], int rest[]) {
		
		int chancecard = (int)(Math.random()*8+1);
		switch(chancecard) {
			case 1:
				System.out.println("去新加坡吃口香糖，被政府抓罰200元");
				money[turn] -= 200;
				break;
			case 2:
				System.out.println("在日本欣賞藝妓表演花費500元");
				money[turn] -= 500;
				break;
			case 3:
				System.out.println("去泰國抓飯吃沒洗手，感染痢疾休息1回合");
				rest[turn] = 1;
				break;
			case 4:
				System.out.println("在台北101看煙火，撿到800元");
				money[turn] += 800;
				break;
			case 5:
				System.out.println("到北海道擠牛奶，精神百倍，前進1格");
				chess[turn][chessposition[turn]] = " "; //將棋子從原位置拿走
				chessposition[turn] += 1; //棋子位置+1
				chess[turn][chessposition[turn]] = symbol[turn]; //將棋子放入新位置
				print_map(chess, house); //print地圖
				break;
			case 6:
				System.out.println("到韓國吃泡菜，太辣腸胃不適，到廁所休息2回合");
				chess[turn][chessposition[turn]] = " "; //將棋子從原位置拿走
				chessposition[turn] = 7; //棋子位置改到廁所位置
				chess[turn][chessposition[turn]] = symbol[turn]; //將棋子放入新位置
				rest[turn] = 2; //休息2回合，暫停陣列放2
				print_map(chess, house); //print地圖
				break;	
			case 7:
				System.out.println("到泰國被誤認為是人妖被抓去表演人妖秀，賺了500元");
				money[turn] += 500;
				break;	
			case 8:
				System.out.println("到墨西哥學習做捲餅，自己開店賺了1000元");
				money[turn] += 1000;
				break;
		}
		
	}
	
	//命運
	public static void community_chest_cards(int money[], String chess[][], int chessposition[], int turn, String house[][], int rest[]) {
		
		int communitychestcard = (int)(Math.random()*8+1);
		switch(communitychestcard) {
			case 1:
				System.out.println("在紐西蘭泡溫泉泡到昏倒送醫急救，花費200元");
				money[turn] -= 200;
				break;
			case 2:
				System.out.println("看到自由女神被嚇到，收驚花500元");
				money[turn] -= 500;
				break;
			case 3:
				System.out.println("到俄羅斯遇到大風雪，到公園休息2回合");
				chess[turn][chessposition[turn]] = " "; //將棋子從原位置拿走
				chessposition[turn] = 17; //棋子位置改到公園位置
				chess[turn][chessposition[turn]] = symbol[turn]; //將棋子放入新位置
				rest[turn] = 2; //休息2回合，暫停陣列放2
				print_map(chess, house); //print地圖
				break;
			case 4:
				System.out.println("在日本收集到7顆龍珠，跟所有玩家各收取200元");
				//跟所有玩家各收取200元:自己+600，其他人-200
				//自己先+800，再全部人-200 = 自己+600，其他人-200
				money[turn] += 800;
				for(int i = 0; i < 4; i++) {
					money[i] -= 200;
				}
				break;
			case 5:
				System.out.println("到美國看王建民，要到簽名，轉手獲利500元");
				money[turn] += 500;
				break;
			case 6:
				System.out.println("到西班牙參加鬥牛節，不慎發身意外，所有玩家捐出200元");
				for(int i = 0; i < 4; i++) {
					money[i] -= 200;
				}
				break;
			case 7:
				System.out.println("到澳洲打工度假，賺了1000元");
				money[turn] += 1000;
				break;
			case 8:
				System.out.println("到土耳其跳旋轉舞，頭暈跌到，倒退1格");
				chess[turn][chessposition[turn]] = " "; //將棋子從原位置拿走
				chessposition[turn] -= 1; //棋子位置-1
				chess[turn][chessposition[turn]] = symbol[turn]; //將棋子放入新位置
				print_map(chess, house); //print地圖
				break;
		}
		
	}
	
	//結束遊戲判定
	public static boolean check_end(int money[], int turn) {
		boolean end;
		int moneychange;
		int change;
		int playermoneyorder[] = new int[4]; //金錢排名順序
		int playerorder[] = new int[4]; //玩家排名順序
		
		//將玩家和對應持有的金錢放入陣列
		for (int i = 0; i < 4; i++) {
			playermoneyorder[i] = money[i];
			playerorder[i] = i;
		}
		
		//如果有人破產，代表遊戲結束，boolean值end = true
		if(money[turn] < 0) {
			end = true;
			
			//排名順序
			for(int i=3 ; i>0 ; i--) {
				for(int j=0 ; j<i ; j++) {
					if(playermoneyorder[j] < playermoneyorder[j+1]) {
						moneychange = playermoneyorder[j];
						change = playerorder[j];
						playermoneyorder[j] = playermoneyorder[j+1];
						playerorder[j] = playerorder[j+1];
						playermoneyorder[j+1] = moneychange;
						playerorder[j+1] = change;
					}	
				}
			}
			
			//將結果print出來，持有最高金額玩家為第1名，以此類推排序
			System.out.println("遊戲結束了，玩家排名如下");
			for (int i = 0; i < 4; i++) {
				System.out.println("第" + (i+1) + "名: 玩家" + (playerorder[i]+1) + " 擁有金額:" + playermoneyorder[i]);
			}
			
		}else {
			end = false;
		}
		
		//回傳end = true 或 false
		return(end);
	}
	
	//main函式
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//初始化
		
		/* 玩家資訊
		 * player_information[i][j]
		 * i代表玩家
		 * [i][0] 已購買的土地
		 * [i][1] 蓋一棟房子的國家
		 * [i][2] 蓋兩棟房子的國家
		 * [i][3] 蓋三棟房子的國家
		 */
		String player_information[][] = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					player_information[i][j] = "目前沒有";
				}
				if (j == 1) {
					player_information[i][j] = "目前沒有";
				}
				if (j == 2) {
					player_information[i][j] = "目前沒有";
				}
				if (j == 3) {
					player_information[i][j] = "目前沒有";
				}
			}
		}
		
		//houserank[i][j][k] i放入turn，代表玩家 j代表房子階級 k放入chessposition[turn]，代表國家
		String houserank[][][] = new String[4][4][20];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 20; k++) {
				houserank[i][j][k] = "";
				}
			}
		}
		
		String chess[][] = new String[4][20]; //chess[i][j]:在地圖上的棋子，i代表玩家 j代表棋子位置
	
		String house[][]= new String[2][20]; //house[i][j] i = 0代表地圖上蓋房子，i = 1代表擁有權   j代表國家
		for (int j = 0; j < 20; j++) {
			house[0][j] = "   ";
			chess[0][j] = " ";
			chess[1][j] = " ";
			chess[2][j] = " ";
			chess[3][j] = " ";
		}
		
		chess[0][0] = symbol[0]; //玩家1
		chess[1][0] = symbol[1]; //玩家2
		chess[2][0] = symbol[2]; //玩家3
		chess[3][0] = symbol[3]; //玩家4
		
		int money[] = new int[4]; //玩家們的金錢
		int chessposition[] = new int[4]; //玩家們的所在位置
		int rest[] = new int[4]; //暫停陣列
		
		for (int i = 0; i < 4; i++) {
			money[i] = 5000;
			chessposition[i] = 0;
			rest[i] = 0;
		}
		
		int countryinformation[][] = new int[9][20]; //國家資訊
		country_information(countryinformation);
		
		int turn = 0; //玩家順序(0~3):0代表玩家1，1代表玩家2，2代表玩家3，3代表玩家4
		
		
		
		//遊戲進行
		rule();
		print_map(chess, house); //print地圖
		
		boolean end = false;
		
		while(end == false) {
			for(turn = 0; turn <= 3; turn++) {
				System.out.println("輪到玩家"+ (turn+1) + "了!");
				if(rest[turn] != 0) { //檢查玩家是否需要休息
					rest[turn] -= 1;
					if(rest[turn] != 0) {
						System.out.println("這回合要休息哦~\n還要休息"+ rest[turn] + "回合" );
					}else {
						System.out.println("這回合要休息哦~\n下回合就換你嘍" );
					}
					System.out.println("");
				}else {
					//擲骰子
					System.out.println("請輸入任意數字進行擲骰子");
					int keyin = sc.nextInt();
					chess_move(chess, chessposition, turn, symbol[turn]); //棋子移動
					print_map(chess, house); //print地圖
					print_player_informaiton(player_information, money, turn); //print玩家資訊
					
					//以下為判斷走到哪一格
					if (chessposition[turn] == 0 || chessposition[turn] == 7 || chessposition[turn] == 10 || chessposition[turn] == 17) {
						//4個角落的
						if (chessposition[turn] == 0 ) {
							System.out.println("走回起點了!獲得3000元");
							money[turn] += 3000;
						}
						if (chessposition[turn] == 7 ) {
							System.out.println("走到廁所，休息1回合");
							rest[turn] = 1;
						}
						if (chessposition[turn] == 10 ) {
							System.out.println("走到返回起點");
							chess[turn][chessposition[turn]] = " "; //將棋子從原位置拿走
							chessposition[turn] = 0; //起點位置
							chess[turn][chessposition[turn]] = symbol[turn]; //將棋子放到起點位置
							print_map(chess, house); //print地圖
						}
						if (chessposition[turn] == 17 ) {
							System.out.println("走到公園，休息2回合");
							rest[turn] = 2;
						}
					}
					else if (chessposition[turn] == 5 || chessposition[turn] == 15) {
						//機會
						System.out.println("走到機會格了!");
						System.out.println("請輸入任意數字翻開機會卡");
						int chance = sc.nextInt();
						chance_cards(money, chess, chessposition, turn, house, rest); //機會函式
						print_player_informaiton(player_information, money, turn); //print玩家資訊
					}
					else if (chessposition[turn] == 2 || chessposition[turn] == 12) {
						//命運
						System.out.println("走到命運格了!");
						System.out.println("請輸入任意數字翻開命運卡");
						int community_chest = sc.nextInt();
						community_chest_cards(money, chess, chessposition, turn, house, rest); //命運函式
						print_player_informaiton(player_information, money, turn); //print玩家資訊
					}
					else {
						//檢查能不能買土地或蓋房子
						boolean has_house_been_bought = check_house(chessposition, house, turn); //檢查土地擁有權
						if (has_house_been_bought == true && house[0][chessposition[turn]] != symbol[8]) {
							while(true) {
								country_cards_cost(chessposition, turn, countryinformation); //國家土地和房子費用資訊
								country_cards_fee(chessposition, turn, countryinformation); //國家土地和房子過路費資訊
								System.out.println("請問是否要購買土地or蓋房子? 1.是 2.否");
								int buyhouse = sc.nextInt();
								if (buyhouse == 1 || buyhouse == 2) {
									if (buyhouse == 1) {
										buy_house(chess, chessposition, turn, house, money, countryinformation, player_information, houserank); //買土地或蓋房子
										print_player_informaiton(player_information, money, turn); //print玩家資訊
									}
									break;
								}
								else {
									System.out.println("輸入錯誤，請輸入1 or 2");
								}
							}
						}
						else {
							//付過路費
							System.out.println("哎呀!走到別人的土地了!");
							country_cards_fee(chessposition, turn, countryinformation); //國家土地和房子過路費資訊
							for (int i = 5; i <= 8; i++) {
								if(house[0][chessposition[turn]] == symbol[i]) {
									System.out.println("你要付" + countryinformation[i-1][chessposition[turn]] + "元給玩家" + (Integer.parseInt(house[1][chessposition[turn]])+1)); //如果house[1][chessposition[turn]] = 0代表是玩家1的，所以要+1(0+1=玩家1)
									money[turn] -= countryinformation[i-1][chessposition[turn]];
									money[Integer.parseInt(house[1][chessposition[turn]])] += countryinformation[i-1][chessposition[turn]];
								}
							}
							print_player_informaiton(player_information, money, turn); //print玩家資訊	
						}	
					}
				}
				//遊戲結束判定
				end = check_end(money, turn);
				if(end == true) {
					break;
				}
			}
		}
	}
	
}











