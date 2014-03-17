package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Carta;

import static java.lang.System.out;

public class GameView {

	private Scanner teclado = new Scanner(System.in);
	
	public String getUserInput()
	{
		return teclado.nextLine();
	}
	
	public void printLine(String mensagem)
	{
		System.out.println( mensagem );
	}
	
	public void mostraCarta(String numero, char naipe) {
		out.println(String.format("Carta: %s%c",
				                  numero,
				                  naipe));
	}
	
	public void mostraPontos(int pontos) {
		out.println(String.format("Pontos do jogador: %d",
				                  pontos));
	}
		
}
