package control;

import java.io.FileNotFoundException;

import entity.CGwamok;
import entity.VGwamok;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CGwamokControl extends CControl{
	public VGwamok login(VUser vUser){
		CGwamok gwamok = new CGwamok();
		VGwamok vGwamok = new VGwamok();
		try {
			this.getDao().connect("sugang.txt");
			while(this.getDao().hasNext()) {
				gwamok = (CGwamok) this.getDao().read(gwamok);
				if(gwamok.getName().equals(vUser.getUserID())){
					vGwamok.setID1(gwamok.getID1());
					vGwamok.setID2(gwamok.getID2());
					break;
				}
			}
			
			return vGwamok;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();  // 빨간색 에러 출력부분
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vGwamok;
		}
	}
}
