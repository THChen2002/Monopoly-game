package fianal_project;
import java.util.Scanner;

public class monopoly {

	//���a�Ѥl�M�g�a�Фl�ϥ�
	public static String symbol[] = {"1", "2", "3", "4", "   ", " �� ", " �� ", "���� ", "������"};
	
	//��a�W�r�M���|(?)�R�B(!)�Х�
	public static String country_name[] = {"Start", "KOR", " ! ", "JPN", "MEX", " ? ", "NZL", "Toilet", "USA", "RUS", "Back", "SGP", " ! ", "ESP", "THA", " ? ", "AUS", "Park", "TUR", "TWN"};
	
	//�C���W�h����
	public static void rule() {
		System.out.println("�w��Ө�j�I�����C�@�ɤ���\n");
		System.out.println("�C���Ҧ�:\n1.��4�쪱�a(���O�H1�B2�B3�B4�N��)\n2.�C�H��l���B:5000\n");
		System.out.println("�\��:\n1.�Y��l\n2.�ʶR�g�aor�\�Фl\n3.���|�B�R�B\n4.�|�ӯS������:�_�I���y�B�^��_�I�B��"
							+ "\n5.��ܪ��a(�������B�B�w�ʶR���g�a�B�Фl)�M��a��T(�ʶR�������M�L���O)\n");
		System.out.println("���a�i��ܰʧ@:\n�ʶR�g�a(�H���N��)or�\�Фl(�̦h�i�H�\��T�ɡA�H���B�����B�������N��)\n");
		System.out.println("�C������:\n�p�G��1�H�}���h�C�������A�è̾ڳѾl���B�C�X�ƦW\n");
	}
	
	//��a�g�a�M�Фl�O�ΤιL���O
	public static void country_information(int countryinformation[][]) {
		
		/*[0][i]�R�g�a����		[4][i]�R�g�a���L���O
		 *[1][i]�\�@�ɩФl����	[5][i]�\�@�ɩФl���L���O
		 *[2][i]�\��ɩФl����	[6][i]�\��ɩФl���L���O
		 *[3][i]�\�T�ɩФl����	[7][i]�\�T�ɩФl���L���O
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
	
	//print�a��
	public static void print_map(String chess[][], String house[][]) {
		System.out.println();
		System.out.println("  �z�w�w�w�w�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�w�w�w�w�{");
		System.out.println("  �x " + "       " + " �x " + house[0][1] + " �x   " + "  �x " + house[0][3] + " �x " + house[0][4] + " �x   " + "  �x " + house[0][6] + " �x  "  + "Toilet" + " " + "�x");
		System.out.println("  �x  Start  �u�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�t  Pause  �x");
		System.out.println("  �x +$3000  �x KOR �x  !  �x JPN �x MEX �x  ?  �x NZL �x    1    �x");
		System.out.println("  �x  �� �� ��  �x$2200�x     �x$2400�x$3000�x     �x$3600�x  Round  �x");
		System.out.println("  �x " + " " + "  " + chess[0][0] + chess[1][0] + chess[2][0] + chess[3][0] + " �x" + chess[0][1] + chess[1][1] + chess[2][1] + chess[3][1] +" �x" +  chess[0][2] + chess[1][2] + chess[2][2] + chess[3][2] + " �x" +  chess[0][3] + chess[1][3] + chess[2][3] + chess[3][3] + " �x" +  chess[0][4] + chess[1][4] + chess[2][4] + chess[3][4] + " �x" +  chess[0][5] + chess[1][5] + chess[2][5] + chess[3][5] + " �x" +  chess[0][6] + chess[1][6] + chess[2][6] + chess[3][6] + " �x" +  chess[0][7] + chess[1][7] + chess[2][7] + chess[3][7] + "     " + "�x");
		System.out.println("  �u�w�w�w�s�w�w�w�w�w�q�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�q�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�q�w�w�w�w�w�s�w�w�w�t");
		System.out.println("  �x   �x TWN �x                 �x                 �x USA �x   �x");
		System.out.println("  �x   �x$4000�x                 �x                 �x$2200�x   �x");
		System.out.println("  �x" + house[0][19] + "�x" +  chess[0][19] + chess[1][19] + chess[2][19] + chess[3][19] + " �x     " + " Chance  " + "   �x" + " Community chest " + "�x" +  chess[0][8] + chess[1][8] + chess[2][8] + chess[3][8] + " �x" + house[0][8] + "�x");
		System.out.println("  �u�w�w�w�q�w�w�w�w�w�t        ?        �x         !       �u�w�w�w�w�w�q�w�w�w�t");
		System.out.println("  �x   �x TUR �x                 �x                 �x RUS �x   �x");
		System.out.println("  �x   �x$2200�x                 �x                 �x$1000�x   �x");
		System.out.println("  �x" + house[0][18] + "�x" +  chess[0][18] + chess[1][18] + chess[2][18] + chess[3][18] + " �x " + "       X       " + " �x " + "       Y       " + " �x" +  chess[0][9] + chess[1][9] + chess[2][9] + chess[3][9] + " �x" + house[0][9] + "�x");
		System.out.println("  �u�w�w�w�r�w�w�w�w�w�q�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�q�w�w�w�w�w�s�w�w�w�w�w�s�w�w�w�w�w�q�w�w�w�w�w�r�w�w�w�t");
		System.out.println("  �x " + " " + "  " +  chess[0][17] + chess[1][17] + chess[2][17] + chess[3][17] + " �x" +  chess[0][16] + chess[1][16] + chess[2][16] + chess[3][16] + " �x" +  chess[0][15] + chess[1][15] + chess[2][15] + chess[3][15] + " �x" +  chess[0][14] + chess[1][14] + chess[2][14] + chess[3][14] + " �x" +  chess[0][13] + chess[1][13] + chess[2][13] + chess[3][13] + " �x" +  chess[0][12] + chess[1][12] + chess[2][12] + chess[3][12] + " �x" +  chess[0][11] + chess[1][11] + chess[2][11] + chess[3][11] + " �x" +  chess[0][10] + chess[1][10] + chess[2][10] + chess[3][10] + "     "  + "�x");
		System.out.println("  �x   Park  �x AUS �x     �x THA �x ESP �x     �x SGP �x  Back   �x");
		System.out.println("  �x  Break  �x$2400�x  ?  �x$2000�x$1600�x  !  �x$3000�x  To     �x");
		System.out.println("  �x    2    �u�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�q�w�w�w�w�w�t  Start  �x");
		System.out.println("  �x  " + "Round" + "  �x " + house[0][16] + " �x   " + "  �x " + house[0][14] + " �x " + house[0][13] + " �x   " + "  �x " + house[0][11] + " �x " + "        "  + "�x");
		System.out.println("  �|�w�w�w�w�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�r�w�w�w�w�w�w�w�w�w�}");
	}
	
	//print���a��T:�������B�B���g�a�λ\�Фl����a
	public static void print_player_informaiton(String player_information[][], int money[], int turn) {
		System.out.println();
		System.out.println("�A�{�b�ҫ��������B:" + money[turn]);
		System.out.println("�A�{�b�ҫ������g�a:" + player_information[turn][0]);
		System.out.println("�A�{�b�\�@�ɩФl����a:" + player_information[turn][1]);
		System.out.println("�A�{�b�\��ɩФl����a:" + player_information[turn][2]);
		System.out.println("�A�{�b�\�T�ɩФl����a:" + player_information[turn][3]);
		System.out.println();
	}

	//�Ѥl����
	public static void chess_move(String chess[][], int chessposition[], int turn, String symbol) {
		int dice = (int)(Math.random()*6+1);
		System.out.println("��l�I�Ƭ�" + dice + "�A�e�i" + dice + "�B!");
		
		//turn:���a���� 0�O���a1�A1�O���a2�A2�O���a3�A3�O���a4
		chess[turn][chessposition[turn]] = " ";//�N�Ѥl�q��Ӧ�m����
		chessposition[turn] += dice;
		
		//chessposition(�Ѥl��m):0~19�A�p�G�W�L19�N�n-20
		if (chessposition[turn] > 19) {
			chessposition[turn] -=20 ;
		}
		chess[turn][chessposition[turn]] = symbol;//�N�Ѥl��J�s��m
	}

	//�P�_����g�a�O�_�w�Q�ʶR�B�g�a�֦��̬O�ۤv�٬O�L�H�A�p�G�֦��̬O�ۤv�]�i�ɯũФl
	public static boolean check_house(int chessposition[], String house[][], int turn) {
		//�p�G�g�a�O�ۤv���Aboolean�Ȭ�true
		boolean has_house_been_bought = true;
		
		//house[0][chessposition[turn]]:�g�a�ثe�ҼˡA�b���ΨӽT�{�g�a�O�_���Ŧa
		//house[1][chessposition[turn]]:�g�a�֦��v�A��Jturn�Ӫ�ܤg�a�O�֪�
		if ((house[0][chessposition[turn]] == "   ") || Integer.parseInt(house[1][chessposition[turn]]) == turn) { //�j��NString�নint
			has_house_been_bought = true;
		}else {
			has_house_been_bought = false;
		}
			
		return(has_house_been_bought);
	}
	
	//�ʶR�g�a�λ\�Фl
	public static void buy_house(String chess[][], int chessposition[], int turn, String house[][], int money[], int countryinformation[][], String player_information[][], String houserank[][][]) {
		
			for (int i = 0; i <= 3; i++) {
				if (money[turn] >= countryinformation[i][chessposition[turn]]) { //�p�G�����h
					if (house[0][chessposition[turn]] == symbol[4+i]) {
						house[1][chessposition[turn]] = turn+""; //�j��Nint�নString
						house[0][chessposition[turn]] = symbol[5+i];
						money[turn] -= countryinformation[i][chessposition[turn]];
						for (int j = 5; j <= 8; j++) {
							if (player_information[turn][i] == "�ثe�S��") {
								player_information[turn][i] = "";
							}
							if (house[0][chessposition[turn]] == symbol[5]) { //symbol[5]:" �� "(�g�a)
								//houserank[i][j][k] i��Jturn�A�N���a j�N��Фl���� k��Jchessposition[turn]�A�N���a
								houserank[turn][0][chessposition[turn]] = country_name[chessposition[turn]] + " "; //�bhouserank��J��a�W
							}
							else if (house[0][chessposition[turn]] == symbol[j]) { //symbol[j]:���\�Фl
								//�p�G���a�\�s�Фl�Aex:�\�@�ɩФl
								houserank[turn][j-6][chessposition[turn]] = ""; //�N��a�W�q�°}�C(�g�a)���X
								houserank[turn][j-5][chessposition[turn]] = country_name[chessposition[turn]] + " "; //�N��a�W��J�s�}�C(�@�ɩФl)
							}
						}
						for (int k = 0; k <= 3; k++) {
							if (player_information[turn][k] != "�ثe�S��") {
								player_information[turn][k] = "";
								for (int m = 0; m <= 19; m++) {
									//�Nhouserank�}�C�̪���a�W�Ӷ��ǩ�Jplayer_information�}�C�A����nprint�X��
									player_information[turn][k] = player_information[turn][k] + houserank[turn][k][m];
								}
								//�p�Gplayer_information�}�C�̨S����a�W�A�h��"�ثe�S��"
								if (player_information[turn][k] == "") {
									player_information[turn][k] = "�ثe�S��";
								}
							}
						}
					}
					else {
						continue;
					}
					System.out.println("���ߧA���\�ʶR�g�a");
					break;
				}
				else {
					System.out.println("�A���������R��!");
					break;
				}
			}
	}
	
	//��a�R�g�a�λ\�Фl���O�θ�T�d
	public static void country_cards_cost(int chessposition[], int turn, int countryinformation[][]) {
		System.out.println("�H�U������a�R�g�a�λ\�Фl����T�d");
		
		System.out.println("  �z�w�w�w�w�w�w�w�w�w�w�w�w�w�w�{");
		System.out.println("  �x    "+ country_name[chessposition[turn]]+" cost  �x");
		if (countryinformation[0][chessposition[turn]] >= 1000) {
			System.out.println("  �x land   $"+ countryinformation[0][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x land   $"+ countryinformation[0][chessposition[turn]] +"  �x");
		}
		if(countryinformation[1][chessposition[turn]] >=1000) {
			System.out.println("  �x House1 $"+ countryinformation[1][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House1 $"+ countryinformation[1][chessposition[turn]] +"  �x");
		}
		if(countryinformation[2][chessposition[turn]] >=1000) {
			System.out.println("  �x House2 $"+ countryinformation[2][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House2 $"+ countryinformation[2][chessposition[turn]] +"  �x");
		}
		if(countryinformation[3][chessposition[turn]] >=1000) {
			System.out.println("  �x House3 $"+ countryinformation[3][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House3 $"+ countryinformation[3][chessposition[turn]] +"  �x");
		}
		System.out.println("  �|�w�w�w�w�w�w�w�w�w�w�w�w�w�w�}");
		
	}
	
	//��a���L���O��T�d
	public static void country_cards_fee(int chessposition[], int turn, int countryinformation[][]) {
		System.out.println("�H�U������a���L���O��T�d");
		
		System.out.println("  �z�w�w�w�w�w�w�w�w�w�w�w�w�w�w�{");
		System.out.println("  �x    "+ country_name[chessposition[turn]]+" fee   �x");
		if (countryinformation[4][chessposition[turn]] >= 1000) {
			System.out.println("  �x land   $"+ countryinformation[4][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x land   $"+ countryinformation[4][chessposition[turn]] +"  �x");
		}
		if(countryinformation[5][chessposition[turn]] >=1000) {
			System.out.println("  �x House1 $"+ countryinformation[5][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House1 $"+ countryinformation[5][chessposition[turn]] +"  �x");
		}
		if(countryinformation[6][chessposition[turn]] >=1000) {
			System.out.println("  �x House2 $"+ countryinformation[6][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House2 $"+ countryinformation[6][chessposition[turn]] +"  �x");
		}
		if(countryinformation[7][chessposition[turn]] >=1000) {
			System.out.println("  �x House3 $"+ countryinformation[7][chessposition[turn]] +" �x");
		}
		else {
			System.out.println("  �x House3 $"+ countryinformation[7][chessposition[turn]] +"  �x");
		}
		System.out.println("  �|�w�w�w�w�w�w�w�w�w�w�w�w�w�w�}");
		
	}
	
	//���|
	public static void chance_cards(int money[], String chess[][], int chessposition[], int turn, String house[][], int rest[]) {
		
		int chancecard = (int)(Math.random()*8+1);
		switch(chancecard) {
			case 1:
				System.out.println("�h�s�[�Y�Y�f���}�A�Q�F����@200��");
				money[turn] -= 200;
				break;
			case 2:
				System.out.println("�b�饻�Y��������t��O500��");
				money[turn] -= 500;
				break;
			case 3:
				System.out.println("�h����춺�Y�S�~��A�P�V�g�e��1�^�X");
				rest[turn] = 1;
				break;
			case 4:
				System.out.println("�b�x�_101�ݷϤ��A�ߨ�800��");
				money[turn] += 800;
				break;
			case 5:
				System.out.println("��_���D�������A�믫�ʭ��A�e�i1��");
				chess[turn][chessposition[turn]] = " "; //�N�Ѥl�q���m����
				chessposition[turn] += 1; //�Ѥl��m+1
				chess[turn][chessposition[turn]] = symbol[turn]; //�N�Ѥl��J�s��m
				print_map(chess, house); //print�a��
				break;
			case 6:
				System.out.println("������Y�w��A�ӻ��z�G���A�A��Z�ҥ�2�^�X");
				chess[turn][chessposition[turn]] = " "; //�N�Ѥl�q���m����
				chessposition[turn] = 7; //�Ѥl��m���Z�Ҧ�m
				chess[turn][chessposition[turn]] = symbol[turn]; //�N�Ѥl��J�s��m
				rest[turn] = 2; //��2�^�X�A�Ȱ��}�C��2
				print_map(chess, house); //print�a��
				break;	
			case 7:
				System.out.println("�����Q�~�{���O�H���Q��h��t�H���q�A�ȤF500��");
				money[turn] += 500;
				break;	
			case 8:
				System.out.println("�쾥����ǲ߰�����A�ۤv�}���ȤF1000��");
				money[turn] += 1000;
				break;
		}
		
	}
	
	//�R�B
	public static void community_chest_cards(int money[], String chess[][], int chessposition[], int turn, String house[][], int rest[]) {
		
		int communitychestcard = (int)(Math.random()*8+1);
		switch(communitychestcard) {
			case 1:
				System.out.println("�b�æ����w�Ŭu�w����˰e���ϡA��O200��");
				money[turn] -= 200;
				break;
			case 2:
				System.out.println("�ݨ�ۥѤk���Q�~��A�����500��");
				money[turn] -= 500;
				break;
			case 3:
				System.out.println("��Xù���J��j�����A�줽���2�^�X");
				chess[turn][chessposition[turn]] = " "; //�N�Ѥl�q���m����
				chessposition[turn] = 17; //�Ѥl��m��줽���m
				chess[turn][chessposition[turn]] = symbol[turn]; //�N�Ѥl��J�s��m
				rest[turn] = 2; //��2�^�X�A�Ȱ��}�C��2
				print_map(chess, house); //print�a��
				break;
			case 4:
				System.out.println("�b�饻������7���s�]�A��Ҧ����a�U����200��");
				//��Ҧ����a�U����200��:�ۤv+600�A��L�H-200
				//�ۤv��+800�A�A�����H-200 = �ۤv+600�A��L�H-200
				money[turn] += 800;
				for(int i = 0; i < 4; i++) {
					money[i] -= 200;
				}
				break;
			case 5:
				System.out.println("�����ݤ��إ��A�n��ñ�W�A�����Q500��");
				money[turn] += 500;
				break;
			case 6:
				System.out.println("���Z���ѥ[�����`�A���V�o���N�~�A�Ҧ����a���X200��");
				for(int i = 0; i < 4; i++) {
					money[i] -= 200;
				}
				break;
			case 7:
				System.out.println("��D�w���u�װ��A�ȤF1000��");
				money[turn] += 1000;
				break;
			case 8:
				System.out.println("��g�ը������R�A�Y�w�^��A�˰h1��");
				chess[turn][chessposition[turn]] = " "; //�N�Ѥl�q���m����
				chessposition[turn] -= 1; //�Ѥl��m-1
				chess[turn][chessposition[turn]] = symbol[turn]; //�N�Ѥl��J�s��m
				print_map(chess, house); //print�a��
				break;
		}
		
	}
	
	//�����C���P�w
	public static boolean check_end(int money[], int turn) {
		boolean end;
		int moneychange;
		int change;
		int playermoneyorder[] = new int[4]; //�����ƦW����
		int playerorder[] = new int[4]; //���a�ƦW����
		
		//�N���a�M����������������J�}�C
		for (int i = 0; i < 4; i++) {
			playermoneyorder[i] = money[i];
			playerorder[i] = i;
		}
		
		//�p�G���H�}���A�N��C�������Aboolean��end = true
		if(money[turn] < 0) {
			end = true;
			
			//�ƦW����
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
			
			//�N���Gprint�X�ӡA�����̰����B���a����1�W�A�H�������Ƨ�
			System.out.println("�C�������F�A���a�ƦW�p�U");
			for (int i = 0; i < 4; i++) {
				System.out.println("��" + (i+1) + "�W: ���a" + (playerorder[i]+1) + " �֦����B:" + playermoneyorder[i]);
			}
			
		}else {
			end = false;
		}
		
		//�^��end = true �� false
		return(end);
	}
	
	//main�禡
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��l��
		
		/* ���a��T
		 * player_information[i][j]
		 * i�N���a
		 * [i][0] �w�ʶR���g�a
		 * [i][1] �\�@�ɩФl����a
		 * [i][2] �\��ɩФl����a
		 * [i][3] �\�T�ɩФl����a
		 */
		String player_information[][] = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					player_information[i][j] = "�ثe�S��";
				}
				if (j == 1) {
					player_information[i][j] = "�ثe�S��";
				}
				if (j == 2) {
					player_information[i][j] = "�ثe�S��";
				}
				if (j == 3) {
					player_information[i][j] = "�ثe�S��";
				}
			}
		}
		
		//houserank[i][j][k] i��Jturn�A�N���a j�N��Фl���� k��Jchessposition[turn]�A�N���a
		String houserank[][][] = new String[4][4][20];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 20; k++) {
				houserank[i][j][k] = "";
				}
			}
		}
		
		String chess[][] = new String[4][20]; //chess[i][j]:�b�a�ϤW���Ѥl�Ai�N���a j�N��Ѥl��m
	
		String house[][]= new String[2][20]; //house[i][j] i = 0�N��a�ϤW�\�Фl�Ai = 1�N��֦��v   j�N���a
		for (int j = 0; j < 20; j++) {
			house[0][j] = "   ";
			chess[0][j] = " ";
			chess[1][j] = " ";
			chess[2][j] = " ";
			chess[3][j] = " ";
		}
		
		chess[0][0] = symbol[0]; //���a1
		chess[1][0] = symbol[1]; //���a2
		chess[2][0] = symbol[2]; //���a3
		chess[3][0] = symbol[3]; //���a4
		
		int money[] = new int[4]; //���a�̪�����
		int chessposition[] = new int[4]; //���a�̪��Ҧb��m
		int rest[] = new int[4]; //�Ȱ��}�C
		
		for (int i = 0; i < 4; i++) {
			money[i] = 5000;
			chessposition[i] = 0;
			rest[i] = 0;
		}
		
		int countryinformation[][] = new int[9][20]; //��a��T
		country_information(countryinformation);
		
		int turn = 0; //���a����(0~3):0�N���a1�A1�N���a2�A2�N���a3�A3�N���a4
		
		
		
		//�C���i��
		rule();
		print_map(chess, house); //print�a��
		
		boolean end = false;
		
		while(end == false) {
			for(turn = 0; turn <= 3; turn++) {
				System.out.println("���쪱�a"+ (turn+1) + "�F!");
				if(rest[turn] != 0) { //�ˬd���a�O�_�ݭn��
					rest[turn] -= 1;
					if(rest[turn] != 0) {
						System.out.println("�o�^�X�n�𮧮@~\n�٭n��"+ rest[turn] + "�^�X" );
					}else {
						System.out.println("�o�^�X�n�𮧮@~\n�U�^�X�N���A��" );
					}
					System.out.println("");
				}else {
					//�Y��l
					System.out.println("�п�J���N�Ʀr�i���Y��l");
					int keyin = sc.nextInt();
					chess_move(chess, chessposition, turn, symbol[turn]); //�Ѥl����
					print_map(chess, house); //print�a��
					print_player_informaiton(player_information, money, turn); //print���a��T
					
					//�H�U���P�_������@��
					if (chessposition[turn] == 0 || chessposition[turn] == 7 || chessposition[turn] == 10 || chessposition[turn] == 17) {
						//4�Ө�����
						if (chessposition[turn] == 0 ) {
							System.out.println("���^�_�I�F!��o3000��");
							money[turn] += 3000;
						}
						if (chessposition[turn] == 7 ) {
							System.out.println("����Z�ҡA��1�^�X");
							rest[turn] = 1;
						}
						if (chessposition[turn] == 10 ) {
							System.out.println("�����^�_�I");
							chess[turn][chessposition[turn]] = " "; //�N�Ѥl�q���m����
							chessposition[turn] = 0; //�_�I��m
							chess[turn][chessposition[turn]] = symbol[turn]; //�N�Ѥl���_�I��m
							print_map(chess, house); //print�a��
						}
						if (chessposition[turn] == 17 ) {
							System.out.println("���줽��A��2�^�X");
							rest[turn] = 2;
						}
					}
					else if (chessposition[turn] == 5 || chessposition[turn] == 15) {
						//���|
						System.out.println("������|��F!");
						System.out.println("�п�J���N�Ʀr½�}���|�d");
						int chance = sc.nextInt();
						chance_cards(money, chess, chessposition, turn, house, rest); //���|�禡
						print_player_informaiton(player_information, money, turn); //print���a��T
					}
					else if (chessposition[turn] == 2 || chessposition[turn] == 12) {
						//�R�B
						System.out.println("����R�B��F!");
						System.out.println("�п�J���N�Ʀr½�}�R�B�d");
						int community_chest = sc.nextInt();
						community_chest_cards(money, chess, chessposition, turn, house, rest); //�R�B�禡
						print_player_informaiton(player_information, money, turn); //print���a��T
					}
					else {
						//�ˬd�ण��R�g�a�λ\�Фl
						boolean has_house_been_bought = check_house(chessposition, house, turn); //�ˬd�g�a�֦��v
						if (has_house_been_bought == true && house[0][chessposition[turn]] != symbol[8]) {
							while(true) {
								country_cards_cost(chessposition, turn, countryinformation); //��a�g�a�M�Фl�O�θ�T
								country_cards_fee(chessposition, turn, countryinformation); //��a�g�a�M�Фl�L���O��T
								System.out.println("�аݬO�_�n�ʶR�g�aor�\�Фl? 1.�O 2.�_");
								int buyhouse = sc.nextInt();
								if (buyhouse == 1 || buyhouse == 2) {
									if (buyhouse == 1) {
										buy_house(chess, chessposition, turn, house, money, countryinformation, player_information, houserank); //�R�g�a�λ\�Фl
										print_player_informaiton(player_information, money, turn); //print���a��T
									}
									break;
								}
								else {
									System.out.println("��J���~�A�п�J1 or 2");
								}
							}
						}
						else {
							//�I�L���O
							System.out.println("�u�r!����O�H���g�a�F!");
							country_cards_fee(chessposition, turn, countryinformation); //��a�g�a�M�Фl�L���O��T
							for (int i = 5; i <= 8; i++) {
								if(house[0][chessposition[turn]] == symbol[i]) {
									System.out.println("�A�n�I" + countryinformation[i-1][chessposition[turn]] + "�������a" + (Integer.parseInt(house[1][chessposition[turn]])+1)); //�p�Ghouse[1][chessposition[turn]] = 0�N��O���a1���A�ҥH�n+1(0+1=���a1)
									money[turn] -= countryinformation[i-1][chessposition[turn]];
									money[Integer.parseInt(house[1][chessposition[turn]])] += countryinformation[i-1][chessposition[turn]];
								}
							}
							print_player_informaiton(player_information, money, turn); //print���a��T	
						}	
					}
				}
				//�C�������P�w
				end = check_end(money, turn);
				if(end == true) {
					break;
				}
			}
		}
	}
	
}











