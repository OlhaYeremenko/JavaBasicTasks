package com.epam.at.yeremenko.lab1;

public class Merger {


	public int[] merge(int[] fst, int[] snd) {
		int[] result = new int[fst.length + snd.length];
		int fstIndex = 0;
		int sndIndex = 0;
		while (fstIndex + sndIndex != result.length) {
			if (fstIndex == fst.length) {			
			  System.arraycopy(snd,sndIndex, result, fstIndex + sndIndex,snd.length-sndIndex);
			  break;
			//	result[fstIndex + sndIndex] = snd[sndIndex++];
			} else if (sndIndex == snd.length) {
			
				System.arraycopy(fst,fstIndex, result, fstIndex + sndIndex,fst.length-fstIndex);
				break;
				//	result[fstIndex + sndIndex] = fst[fstIndex++];
			}
			else if (fst[fstIndex] < snd[sndIndex]) {		
				result[fstIndex + sndIndex] = fst[fstIndex++];
			} else {
				result[fstIndex + sndIndex] = snd[sndIndex++];
			}
		}

		return result;
	}
}
