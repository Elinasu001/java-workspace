package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 네트워크 (Network)
		 * 
		 * 통신 가능한 두 대 이상의 장치들을 물리적 또는 논리적으로 연결한 환경
		 * 네트워크의 목적 : 데이터의 교환
		 * 
		 * 통신이 가능한 장치는 일반적으로 Host 라고 통칭하며,
		 * 종단간의 실제 통신 장치는 EndPoint 라고 표현
		 * 
		 * MAC(Media Address Controller) Address / IP(Internet Protocol) Address
		 * 
		 * - MAC Address : NIC(Network Interface Card)에 실제 제조시 붙여지는 물리적인 주소
		 * 
		 * - IP Address : Internet 상에서 각 Host 들을 식별할 수 있는 논리적인 주소 (언제든지 가변적 변화 가능)
		 * 
		 * - Port Number : Host 내부에서 작동하는 Process 를 식별할 때 사용하는 내부 번호
		 * 
		 * MAC => 이론상, 절대 고정값 => 실제, 가상으로 올려서 사용함
		 * 
		 * => IP 주소와 Port 번호는 항상 고정값이 아니라 변동이 가능한 유동적인 값
		 * 	  단, 값을 바꿀때 IP주소는 같은 네트워크 범위 안에서 겹치면 안됨,
		 * 	  Port 번호는 컴퓨터 내부에서 똑같이 돌면안됨.
		 * 	  즉, 중복이 발생되어선 안됨 !! 충돌 일어남 !!
		 * 
		 * 
		 * - Server 와 Client
		 * 
		 * Server : Client(사용자)에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램
		 * 			즉, Client 의 요청에 대한 응답을 제공해주는 서비스 제공자
		 * 
		 * Client : Server 에게 서비스를 요청하는 물리적인 컴퓨터 또는 프로그램
		 * 			즉, 서비스를 제공받는 고객
		 * 
		 * => 서버는 자기 혼자 응답을 보낼 수 없음!
		 * 	  클라이언트의 요청이 들어와야만 응답을 보낼 수 있는 구조
		 * => 클라이언트는 서버에 요청을 보내기 위해서 서버의 IP 주소와 Port 번호를 알아야 함
		 * 
		 */
		
		// InetAddress : 네트워크 정보를 확인 할 수 있는 클래스
		// getLocalHost() : 로컬 호스트 내놔 ~~
		try {
			InetAddress localHost = InetAddress.getLocalHost();
						// localHost : 현재 프로그램을 동작시킨 장치를 의미
						// getLocalHost() : 작업하고 있는 Host 의 정보를 반환해주는 메소드
			
			System.out.println(localHost); // DESKTOP-T0OOHL3/192.168.10.38
										   // PC 이름 / IP 주소
			
			System.out.println(localHost.getHostName()); // DESKTOP-T0OOHL3
			System.out.println(localHost.getHostAddress()); // 192.168.10.38
			System.out.println("=============================");
			
			/*
			 * 도메인네임을 통해서 서버컴퓨터와 관련된 정보를 얻어낼 수 있음
			 * 
			 * DomainName : 사용자가 서비스를 이용할 때 서버의 IP 주소를 외우기 어려우니까
			 * 				외우기 쉬운구조로 사용자에게 제공되는 이름
			 * 
			 * www.google.com => host파일 => DNS(Domain Name System)
			 * google 서버의 IP 주소를 가지고 웹서버로 HTTP(s)요청
			 */

			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : 도메인네임을 이용해 서버의 정보를 반환
			System.out.println(googleHost); // www.google.com/142.250.198.196
			System.out.println(googleHost.getHostName()); // www.google.com
			System.out.println(googleHost.getHostAddress()); // 142.250.198.196
			
			// 서버는 분산 구조로 이루어져있음 (로드밸런싱...)
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * Client - Server Model
		 * 
		 * 현재 구동중인 서버가 존재하다면 클라이언트는 언제든 서버로 요청을 보낼 수 있음
		 * => 무조건 응답 결과를 돌려 주어야함
		 * 
		 * "요청(request)" 과 응답(response)"으로 프로그램이 동작(통신) 함
		 * 	웹에서의 통신 방식 : HTTPS(Hyper Text Transfer Protocol Secure)
		 * 
		 * 
		 * 순수 자바만을 사용해서 클라이언트와 서버의 간단한 통신 해보기
		 * 
		 * 소켓(Socket)
		 * 
		 * Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
		 * 
		 */
		
		// 결과물
		
		
		
	}

}
