import java.util.*;
public class Main{

	public static void prepareData(Book[] BookList, Staff[] StaffList, Member[] MemberList){
		//Book
		BookList[0] = new Book("IT", "Stephen King");
		BookList[1] = new Book("The Shining", "Stephen King");
		BookList[2] = new Book("Call of Cthulhu", "H.P. Lovecraft");
		BookList[3] = new Book("The Cats of Ulthar", "H.P. Lovecraft");
		
		//Staff
		StaffList[0] = new Staff("Charles Tran", "0987654321", "Manager");
		StaffList[1] = new Staff ("Peter Ngo", "0123456789", "Librarian");
		
		//Member
		MemberList[0] = new Member("Huong Cao", 16, "0135792468", "Nữ");
		MemberList[1] = new Member("Nghia Tran", 17, "0246813579", "Nam");
		MemberList[2] = new Member("Hoa Pham", 16, "0123987456", "Nam");
		MemberList[3] = new Member("Duyen Pham", 17, "0456123789", "Nữ");
	}
	
	public static void bookInfo(Book[] BookList){
		int i = 0;
		for(i = 0; i < 4; i++){
			System.out.printf("====o%do====\n", i+1);
			System.out.printf("Tên sách: %s\n", BookList[i].getName());
			System.out.printf("Tác giả: %s\n", BookList[i].getAuthor());
		}
	}
	
	public static void searchBookByAuthor(Scanner sc, Book[] BookList){
		System.out.print("Nhập vào tên tác giả: ");
		String au = sc.nextLine();
		for(int i = 0; i < 4; i++){
			if(au.equals(BookList[i].getAuthor())){
				System.out.printf("Tên sách: %s\n", BookList[i].getName());
				System.out.printf("====o%do====\n", i+1);
			}
		}
	}
	
	public static void staffInfo(Staff[] StaffList){
		int i = 0;
		for(i = 0; i < 2; i++){
			System.out.printf("====o%do====\n", i+1);
			System.out.printf("Tên nhân viên: %s\n", StaffList[i].getName());
			System.out.printf("Số điện thoại: %s\n", StaffList[i].getPhoneNum());
			System.out.printf("Vị trí: %s\n", StaffList[i].getPosition());
		}
	}
	
	public static void memberInfo(Member[] MemberList){
		int i = 0;
		for(i = 0; i < 4; i++){
			System.out.printf("====o%do====\n", i+1);
			System.out.printf("Tên thành viên: %s\n", MemberList[i].getName());
			System.out.printf("Tuổi: %d\n", MemberList[i].getAge());
			System.out.printf("Số điện thoại: %s\n", MemberList[i].getPhoneNum());
			System.out.printf("Giới tính: %s\n", MemberList[i].getGender());
		}
	}
	
	public static void main(String[] args){
		Book[] BookList = new Book[4];
		Staff[] StaffList = new Staff[2];
		Member[] MemberList = new Member[4];
		prepareData(BookList, StaffList, MemberList);
		Scanner sc =  new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1. Tên sách");
		System.out.println("2. Tên thành viên");
		System.out.println("3. Tên nhân viên");
		System.out.println("4. Tìm sách bằng tên tác giả");
		System.out.println("====o0o====");
		System.out.println("Nhập vào mục muốn chọn: \n");
		int opt = sc.nextInt();
		System.out.print("\n" + opt);
			switch(opt){
			case 1:
				bookInfo(BookList);
				break;
			case 2:
				staffInfo(StaffList);
				break;
			case 3:
				memberInfo(MemberList);
				break;
			case 4:
				searchBookByAuthor(sc, BookList);
				break;
			default:
				System.out.print("\nNhập lại lựa chọn");
				break;
			}
		sc.close();
	}

}