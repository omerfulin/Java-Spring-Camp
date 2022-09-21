
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Hava bugün çok güzel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(3));
		System.out.println("Hava bugün çok güzel " + mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("H"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[10];
		mesaj.getChars(0, 7, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("çok"));
		System.out.println(mesaj.lastIndexOf('g'));
		
		System.out.println("------------------------------");
		
		System.out.println(mesaj.replace('ü', 'u')); 
        System.out.println(mesaj.substring(6)); 

        for(String msg: mesaj.split(" ")) { 
            System.out.println(msg);
        }

        System.out.println(mesaj.toLowerCase()); 

        System.out.println(mesaj.toUpperCase()); 

        System.out.println(mesaj.trim()); 
	}

}
