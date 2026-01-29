package exam;


import java.util.List;

import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		List<Member> memberList = dao.findAll();

		for (Member m : memberList) {
			System.out.println("id = " + m.getId());
			System.out.println("name = " + m.getName());
			System.out.println("age = " + m.getAge());
			System.out.println("dep_id = " + m.getDep_id());
		}

	}

}
