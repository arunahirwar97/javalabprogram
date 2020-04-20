import java.io.FileWriter;
import java.io.IOException;

public class arun {
	public static void main(String[] args) throws IOException
	{
		String  aru = "\t\t\t\t\t\t\t\t\t\tRESUME \n"+"\t\t\t\t\t\t\tArun Ahirwar\n\n" +"\t\t\t\t\t\t\tArun887126@gamil.com\n\n"+"\t\t\t\t\t\t\tDOB : 02/02/2000 \n\n"
	          +"\t\t\t\t\t\t\tAddress : Satlapur Mandideep Raisen \n\n"+"\t\t\t\t\t\t\tContact No. : 8815312085\n\n"+"\t\t\t\t\t\t\tCareer Object :To succeed in an environment of growth and excellence in computer science and \n\t\t\t\t\t\t\t\t\tearn a job which provide me job satisfaction and self development and\n \t\t\t\t\t\t\t\t\thelp me in achieving personal as well as organization goals.\n\n"
				+"\t\t\t\t\t\t\tEducation \n\t\t\t\t\t\t\tQualification \t\t\t Institute \t\t\t    Percenteage \tYear \n\t\t\t\t\t\t\t10th \t     Govt.High school satlapur mandideep Raisen\t\t       78%\t \t2016 \n \t\t\t\t\t\t\t12th \t     Govt Higher Secondary School Mandideep \t\t       83% \t\t2018 \n\t\t\t\t\t\t\t1st Sem      Barkatullah University Institute of Technology , Bhopal  7.76 SGPA         2019 \n\t\t\t\t\t\t\t2nd sem      Barkatullah University Institute of Technology , Bhopal  7.98 SGPA         2019 \n\t\t\t\t\t\t\t3rd Sem      Barkatullah University Institute of Technology , Bhopal  8.48 SGPA         2020 \n\n"+"\t\t\t\t\t\t\tHobbies :  1.Help Poors Children\n\t\t\t\t\t\t\t\t   2.Reading Books\n\n"+"\t\t\t\t\t\t\tLangauge : Hindi\n\t\t\t\t\t\t\t\t   English\n\n"+"\t\t\t\t\t\t\tWork Experience : Fresher";
		FileWriter f = new FileWriter("Arun.txt");
		for (int i=0;i<aru.length();i++)
			f.write(aru.charAt(i));
		
		System.out.println("Writen successfull");
		f.close();
				
	}
}
