package sample04;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import lombok.Setter;

// 인풋이랑 업데이트랑 비슷하다
public class SungJukUpdate implements SungJuk {
	@Setter
	private List <SungJukDTO2> list = null;
	// 생성자나 setter 둘중 하나 선언해라
	// QQQ 근데 어떨대? 생성자? setter?
//	public void setList(List<SungJukDTO2> list) {  >> XML name="" <<여기 set빼고 뒤에 빼고 list
//		this.list = list;
//	}

	@Override
	public void execute() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정 할 이름 입력 :");
		String name = sc.next();
		
		//DB
		UserDTO userDTO =

	userDAO getUser(id);
		if(userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다");
			return;
		}
		System.out.println(userDTO.getName() + "\t"
				+ userDTO.getId() + "\t"
				+ userDTO.getPwd());
		
		System.out.println("수정할 이름 입력 : ");
		String name = sc.next();
		System.out.println("수정할 비밀번호 입력 :");
		String pwd = sc.next();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id", id);
		map.put("pwd", pwd);
		
		userDAO.update(map);
		
		System.out.println("DB의 내용을 수정하였습니다.");
		
		
		
		
		
		/*
		
		int sw=0;
		for(SungJukDTO2 sungJukDTO2  : list) {
			if(sungJukDTO2.getName().equals(name)) {
				sw = 1;
				//자바는 equals 써요
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.println();
				System.out.println("국어 입력 : ");
				int kor = sc.nextInt();
				
				System.out.println("영어 입력 : ");
				int eng = sc.nextInt();
				
				System.out.println("수학 입력 : ");
				int math = sc.nextInt();
				System.out.println();
				

				int tot = kor + eng + math;
				double avg = tot/3.;
				
				sungJukDTO2.setName(name);
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(tot);
				sungJukDTO2.setAvg(avg);
				
				System.out.println(name + "님의 데이터를 수정하였습니다");
				break; //이거는 for문 반복문을 나가라는거다 if 아니다 
			}//if			
		}//for
		if(sw == 0) System.out.println("찾고자하는 이름이 없습니다.");
	
	}*/
}
