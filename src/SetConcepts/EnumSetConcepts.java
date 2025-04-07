package SetConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {
	
		//its not synchronized
		//its a highly performance java collection
		//faster than HashSet
		//all the methods are implemented using bitwise arithmetic operations.
		
		enum Lang {
			JAVA, CSHARP, JAVASRIPT, PYTHON, RUBY, newLang
		}
		public static void main(String[] args) {
			
			//CREaTED A NEW ENUMSET USING ENUM
			EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
			System.out.println(langs);
			
			//empty enum set:
			EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
			System.out.println(l);
			
			//range	(e1,e2):
			EnumSet<Lang> enumRange= EnumSet.range(Lang.JAVA, Lang.CSHARP);
			System.out.println(enumRange);
			
			//of
			EnumSet<Lang> CSharpEnum= EnumSet.of(Lang.JAVA, Lang.CSHARP);
			System.out.println( CSharpEnum);
			
			EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.RUBY);
			System.out.println(multipleEnum);
			
			//add and addAll();
			EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
			EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
			lang2.add(Lang.JAVASRIPT);
			
			lang2.addAll(lang1);
			System.out.println(lang2);
			
			//how to iterate EnumSet: iterator:
			EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
			
			Iterator<Lang> it = fullLang.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
				System.out.println(" , ");
			}
			
			//remove() and removeAll();
			EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
			System.out.println(newLang);
			
			boolean b = newLang.remove(Lang.CSHARP);
			System.out.println(b);
			System.out.println(newLang);
			
			boolean b1 = newLang.remove(Lang.newLang);
			System.out.println(b1);
			System.out.println(newLang);
			
	}

}
