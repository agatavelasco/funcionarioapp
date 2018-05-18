package com.example.cassems.myapplication;

import android.database.sqlite.SQLiteOpenHelper;

public class BDHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "empresa";

    private static final String TABLE_FUNCIONARIO = "funcionario";
    private static final String TABLE_CARGO = "cargo";

    //colunas da tabela funcionario
    private static final String COLUNA_ID_FUNCIONARIO = "funcId";
    private static final String COLUNA_CARGO_ID_FK = "cargoId";
    private static final String COLUNA_NOME_FUNCIONARIO = "funcNome";
    private static final String COLUNA_SALARIO = "salario";

    //colunas da tabela cargo
    private static final String COLUNA_ID_CARGO = "cargoId";
    private static final String COLUNA_NOME_CARGO = "cargoNome";


}
