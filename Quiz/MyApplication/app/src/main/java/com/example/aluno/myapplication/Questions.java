package com.example.aluno.myapplication;

public class Questions {

    public String mQuestions[] = {
            "Qual velocidade o tubarão branco alcança?",
            "Quantos dentes tem um  tubarão?",
            "Qual é o tubarão mais rápido?",
            "Qual é o tubarão mais agressivo?",
            "Qual é o maior tubarão vivo?",
            "Quantos anos vive um tubarão da Groelândia?",
            "Qual a presa principal do grandioso tubarão branco?",
            "Quanto pesa um tubarão branco?",
            "Qual o nome científico do tubarão branco?",
            "Quem tem um tubarão Baleia?"
    };

    private String mChoices[] [] = {

            {"40km", "10km", "20km", "50km"},
            //a
            {"3000", "200", "100", "0"},
            //a
            {"Martelo", "Tigre", "Mako", "Branco"},
            //c
            {"Touro", "Baleia", "Groelândia", "Branco"},
            //a
            {"Megalodon", "Mako", "Cobra", "Baleia"},
            //d
            {"100", "32", "70", "200"},
            //d
            {"tartaruga", "foca", "humano", "ronaldo"},
            //b
            {"2kg", "2t", "200kg", "1t"},
            //b
            {"Carcharodon", "megalodon", "shark white", "tubarones brancus"},

            {"Rayssa", "Ronaldo", "Levi", "Lyslie"},
            {"40km", "10km", "20km", "50km"},
            //a
            {"3000", "200", "100", "0"},
            //a
            {"Martelo", "Tigre", "Mako", "Branco"},
            //c
            {"Touro", "Baleia", "Groelândia", "Branco"},
            //a
            {"Megalodon", "Mako", "Cobra", "Baleia"},
            //d
            {"100", "32", "70", "200"},
            //d
            {"tartaruga", "foca", "humano", "ronaldo"},
            //b
            {"2kg", "2t", "200kg", "1t"},
            //b
            {"Carcharodon", "megalodon", "shark white", "tubarones brancus"},

            {"Rayssa", "Ronaldo", "Levi", "Lyslie"}
            //a
    };

    private String mCorrectAnswer[] = {"40km", "3000", "Mako", "Touro", "Baleia", "200", "foca", "2t", "Carcharodon", "Ronaldo", "40km", "3000", "Mako", "Touro", "Baleia", "200", "foca", "2t", "Carcharodon", "Ronaldo"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoices1(int a){
        String choice = mChoices[a][0];
        return choice;
    }


    public String getChoices2(int a){
        String choice = mChoices[a][1];
        return choice;
    }


    public String getChoices3(int a){
        String choice = mChoices[a][2];
        return choice;
    }


    public String getChoices4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getChoices5(int a){
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

