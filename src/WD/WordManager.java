package WD;

import java.util.Scanner;

public class WordManager {
    WordCRUD wordCrud;
    Scanner s = new Scanner(System.in);
    WordManager(){
        wordCrud = new WordCRUD(s);
    }



    public int selectMenu(){
        System.out.print("*** 영단어 마스터 ***\n\n"
                +"************************\n"
                +"1. 모든 단어 보기\n"
                +"2. 수준별 단어 보기\n"
                +"3. 단어 검색\n"
                +"4. 단어 추가\n"
                +"5. 단어 수정\n"
                +"6. 단어 삭제\n"
                +"7. 파일 저장\n"
                +"0. 나가기\n"
                +"************************\n"
                +"=> 원하는 메뉴는? "
        );
        return s.nextInt();

    }
    public void start(){
        wordCrud.loadFile();
        while(true) {
            int menu = selectMenu();

            if(menu == 0) break;//나가기
            switch(menu){
                case 1 ->{//모든 단어 보기
                    wordCrud.listAll();
                    break;
                }
                case 2 ->{//수준별 단어 보기
                    wordCrud.searchLevel();
                    break;
                }
                case 3 ->{//단어 검색
                    wordCrud.searchWord();
                    break;
                }
                case 4 ->{//단어 추가
                    wordCrud.addItem();
                    break;
                }
                case 5 ->{//단어 수정
                    wordCrud.updateItem();
                    break;
                }
                case 6 ->{//단어 삭제
                    wordCrud.deleteItem();
                    break;
                }
                case 7 ->{//파일 저장
                    wordCrud.saveFile();
                    break;
                }
            }
        }
        System.out.print("\n프로그램 종료! 다음에 만나요~");
    }
}
