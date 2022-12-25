
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patient p;
		pharmacy ph;
		p = new patient();
		ph  = new pharmacy();
		p.setPid(001);
		p.setPname("chandra");
		p.setBedid(101);
		p.setWardid(201);
		p.setDoctorid(301);
		System.out.println("patient id : "+ p.getPid());
		System.out.println("patient name : "+ p.getPname());
		System.out.println("bed id : "+ p.getBedid());
		System.out.println("ward id : "+ p.getWardid());
		System.out.println("doctor id : "+ p.getDoctorid());
		ph.dispaly(101, 401);
		

	}

}
