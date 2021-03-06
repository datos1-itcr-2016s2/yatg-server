package tests;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import Comunication.*;
import Structures.*;
import Structures.Malla.LinkedMatrix;

public class testMalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		LinkedMatrix malla = new LinkedMatrix(10,10);
		Item item1 = new Item(ItemType.bomb, 1, 0);
		Item item2 = new Item(ItemType.shield, 2, 1 );
		Item item3 = new Item(ItemType.turbo, 3, 2);
		Item item4 = new Item(ItemType.bomb, 1, 1);
		Item item5 = new Item(ItemType.increaseTail, 1, 2);
		Item item6 = new Item(ItemType.fuel, 5, 3);
		Item item7 = new Item(ItemType.increaseTail, 1, 3);
		
		System.out.println(item1.getType().toString());
		malla.setNodeItem(item1);
		malla.setNodeItem(item2);
		malla.setNodeItem(item3);
		malla.setNodeItem(item4);
		malla.setNodeItem(item5);
		malla.setNodeItem(item6);
		malla.setNodeItem(item7);

		
		//malla.resetNodeItem(item6);
		//System.out.println(malla.getNodo(0, 3).getItem());
		Troncycle player1 = new	Troncycle(Player.player1, 0, 0);
		player1.setCurrentDirection(Direction.up);
		malla.updatePlayer(player1);
		
		malla.updatePlayer(player1);
		player1.setCurrentDirection(Direction.right);

		malla.updatePlayer(player1);
		
		malla.updatePlayer(player1);
		
		malla.updatePlayer(player1);
		
		malla.updatePlayer(player1);
		Carro carro1  = new Carro(1312, "toyota", Carro.Importancia.taxi);
		carro1.setType(ItemType.bomb);
		
		String carroJson = JsonConverter.objectToJson(carro1);
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		Carro newCarro = new Carro();
		
		try {
			newCarro = mapper.readValue(carroJson, Carro.class);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(newCarro.getPlaca());
		
				
		
		
		
		String itemJson = JsonConverter.objectToJson(item1);
		Item newItem = new Item();
		System.out.println(itemJson);

		
		try {
			newItem = mapper.readValue(itemJson, Item.class);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(newItem.getType());
		
		
		
		
	
		//System.out.println("hola");
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String Jsonlist = JsonConverter.objectToJson(malla.getSimpleItemList());
		System.out.println(Jsonlist);
		System.out.println(malla.getSimpleItemList());
		System.out.println("hola");
		//OutputMessage mensaje = new OutputMessage(player1,malla.getSimpleItemList());
		//String jsonMens = mensaje.toJson();
		//System.out.println(jsonMens);
		
	
		
		
		
		
		
		
	//	String inputMessage = jsonMens;
		//System.out.println(inputMessage);
		OutputMessage newMessage = new OutputMessage();
		// IMPORTANT
		// without this option set adding new fields breaks old code
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		/*try {
			//newMessage = mapper.readValue(inputMessage, OutputMessage.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}*/
		newMessage.getId();
		System.out.println(newMessage.getId());
		

	}

}
