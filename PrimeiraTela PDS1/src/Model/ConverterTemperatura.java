package Model;

public class ConverterTemperatura {
	
	public float converterFtoC(float tempF) {
		float tempConvertida = (tempF - 32f)*5f/9f;
		return tempConvertida;
	}

}
