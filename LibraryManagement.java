import java.util.*;
public class LibraryManagement {

	public static void nameOfBook(Book[] BookList){
		BookList[1] = new Book("IT", "Stephen King");
		BookList[2] = new Book("The Shining", "Stephen King");
		BookList[3] = new Book("Call of Cthulhu", "H.P. Lovecraft");
		BookList[4] = new Book("The Cats of Ulthar", "H.P. Lovecraft");
		int i = 0;
		for(i = 0; i < 4; i++){
			System.out.printf("Tên sách: %s\n", BookList[i].getName());
			System.out.printf("Tác giả: %s\n", BookList[i].getAuthor());
			System.out.printf("====o%do====\n", i);
		}
	}
	public static void nameOfStaff(Staff[] StaffList){
		StaffList[1] = new Staff("Charles Tran", "0987654321", "Manager");
		StaffList[2] = new Staff ("Peter Ngo", "0123456789", "Librarian");
		int i = 0;
		for(i = 0; i < 2; i++){
			System.out.printf("Tên nhân viên: %s\n", StaffList[i].getName());
			System.out.printf("Số điện thoại: %s\n", StaffList[i].getPhoneNum());
			System.out.printf("Vị trí: %s\n", StaffList[i].getPosition());
			System.out.printf("====o%do====\n", i);
		}
	}
	public static void nameOfMember(Member[] MemberList){
		MemberList[1] = new Member("Huong Cao", 16, "0135792468", "Nữ");
		MemberList[2] = new Member("Nghia Tran", 17, "0246813579", "Nam");
		MemberList[3] = new Member("Hoa Pham", 16, "0123987456", "Nam");
		MemberList[4] = new Member("Duyen Pham", 17, "0456123789", "Nữ");
		int i = 0;
		for(i = 0; i < 4; i++){
			System.out.printf("Tên thành viên: %s\n", MemberList[i].getName());
			System.out.printf("Tuổi: %d", MemberList[i].getAge());
			System.out.printf("Số điện thoại: %s\n", MemberList[i].getPhoneNum());
			System.out.printf("Giới tính: %s\n", MemberList[i].getGender());
			System.out.printf("====o%do====\n", i);
		}
	}
	public static void main(String[] args){
		Book[] BookList = new Book[4];
		Staff[] StaffList = new Staff[2];
		Member[] MemberList = new Member[4];
		Scanner sc =  new Scanner(System.in);
		int opt = sc.nextInt();
		System.out.println("Menu:");
			System.out.println("1. Tên sách");
			System.out.println("2. Tên thành viên");
			System.out.println("3. Tên nhân viên");
			System.out.println("4. Thoát chương trình");
			System.out.println("====o0o====");
			System.out.print("\nNhập vào mục muốn chọn: " + opt);
			switch(opt){
			case 1:
				nameOfBook(BookList);
				break;
			case 2:
				nameOfStaff(StaffList);
				break;
			case 3:
				nameOfMember(MemberList);
				break;
			default:
				System.out.print("\nNhập lại lựa chọn");
				break;
			}
		sc.close();
	}

}
