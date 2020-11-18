package user;
/**
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인 
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 */

public interface UserService {
	public String signupformembership(UserDTO user);
	public String login(UserDTO user);
	public String revisepassword(UserDTO user);
	public String membershipwithdrawa(UserDTO user);
	public String idpresencecheck(UserDTO user);
	public String memberList(UserDTO user);
	public String iDsearch(UserDTO user);
	public String searchNames(UserDTO user);
	public String totalnumberofmembers(UserDTO user);
	
}







