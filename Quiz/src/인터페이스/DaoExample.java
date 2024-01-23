package 인터페이스;

public class DaoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
	}
	public static void dbwork(DataAccessObject dataAccessObject) {
		dataAccessObject.select();
		dataAccessObject.insert();
		dataAccessObject.update();
		dataAccessObject.delete();
	}
}
interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}
	
}
class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 삭제");
	}
	
}
