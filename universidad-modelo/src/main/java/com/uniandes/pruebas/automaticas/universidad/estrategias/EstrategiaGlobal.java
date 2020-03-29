package com.uniandes.pruebas.automaticas.universidad.estrategias;

import java.util.Random;

import uk.co.jemos.podam.api.DataProviderStrategy;

public class EstrategiaGlobal implements DataProviderStrategy{

	public Boolean getBoolean() {
		// TODO Auto-generated method stub
		return null;
	}

	public Byte getByte() {
		// TODO Auto-generated method stub
		return null;
	}

	public Byte getByteInRange(byte minValue, byte maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public Character getCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	public Character getCharacterInRange(char minValue, char maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getDouble() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getDoubleInRange(double minValue, double maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public Float getFloat() {
		// TODO Auto-generated method stub
		return null;
	}

	public Float getFloatInRange(float minValue, float maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getInteger() {
		Random random = new Random();
		return Math.abs(random.nextInt());
	}

	public int getIntegerInRange(int minValue, int maxValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Long getLong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getLongInRange(long minValue, long maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public Short getShort() {
		// TODO Auto-generated method stub
		return null;
	}

	public Short getShortInRange(short minValue, short maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStringValue() {
		return "String global";
	}

	public String getStringOfLength(int length) {
		// TODO Auto-generated method stub
		return null;
	}
}
