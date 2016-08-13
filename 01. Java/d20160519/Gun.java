package d20160519;

public class Gun implements Weapon{				// 추상클래스 구체화 함
	
	int MAX_BULLET = 8;						
	int bullet;

	Gun(){										// 생성자
		bullet = MAX_BULLET;					// 총알에 max를 담아줌
	}
	public void 발사(){							// 발사 method

	}
	public void 재장전(){							// 재장전 method

	}
	@Override
	public void use() {							// 추상 method 구체화
		if(bullet>0){							// 총알이 0보다 크면
			System.out.println("빵야~~빵야~~");	// 빵야 문자열 출력
			bullet --;							// 총알--
		}else{									// 0보다 적으면
			System.out.println("틱~~");			// 안나감
		}		
	}
	@Override
	public void reuse() {						// 추상 method 구체화
		System.out.println("reload");
		bullet = MAX_BULLET;
		
	}
	@Override
	public void drop() {						// 추상 method 구체화
		// TODO Auto-generated method stub
		
	}
}
