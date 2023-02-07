package com.jagrosh.jmusicbot.domain.model.info;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ServerInfo {
    private final String version = "1.19.3";
    private final String ip = "182.220.91.17";
    private final int port = 25566;
    private final String modDownloadLink = "https://cdn.discordapp.com/attachments/1069255695133851800/1069960135230898176/mods_2.zip";
    private final String fabricModDownloadLink = "https://maven.fabricmc.net/net/fabricmc/fabric-installer/0.11.1/fabric-installer-0.11.1.exe";
    private final String complementaryShaderPackDownloadLink = "https://www.curseforge.com/minecraft/customization/complementary-shaders/download/4367398/file";
    private final String faithfulResourcePackDownloadLink = "https://database.faithfulpack.net/packs/32x-Java/October%202022/Faithful%2032x%20-%201.19.2.zip";
    private String serverInfoText = null;

    public String getServerInfo() {
        if (serverInfoText == null) {
            StringBuilder sb = new StringBuilder();

            serverInfoText = sb.append("[휘진이의 마크세상] 마인크래프트 서버 정보입니다.")
                    .append("\n\n")
                    .append("서버 주소: ")
                    .append(ip)
                    .append(":")
                    .append(port)
                    .append("\n")
                    .append("마인크래프트 버전: ")
                    .append(version)
                    .append("\n\n")
                    .append("저희 서버는 패브릭 모드를 사용하고 있어서 다운로드가 필요합니다.")
                    .append("\n")
                    .append("패브릭 마인크래프트 런처 다운로드 링크: ")
                    .append(fabricModDownloadLink)
                    .append("\n")
                    .append("(Minecraft Version: 1.19.3 선택하고, Loader Version는 최신 버전으로 선택 후 설치)")
                    .append("\n\n")
                    .append("다음으로 저희 서버에 적용되어 있는 모드들 다운로드가 필요해요.")
                    .append("\n")
                    .append("휘진 서버 모드 다운로드 링크: ")
                    .append(modDownloadLink)
                    .append("\n")
                    .append("위 파일 다운로드 후 %appdata% 폴더 안의 .minecraft\\mods 폴더에 압축 푸시면 됩니다.")
                    .append("\n")
                    .append("(압축 풀었을 때 11개의 .jar 파일이 mods 폴더 안에 들어 있으면 성공이에요)")
                    .append("\n\n")
                    .append("여기까지 진행하시면 서버에 들어오실 수 있어요!")
                    .append("\n")
                    .append("마인크래프트 접속 후 멀티플레이 들어가서 서버 추가 후 들어오시면 됩니다.")
                    .append("\n\n")
                    .append("추가로, 쉐이더팩과 리소스팩도 적용하면 마인크래프트 그래픽이 엄청 이뻐져요.")
                    .append("\n")
                    .append("(다운로드해도 되고 안해도 됩니다)")
                    .append("\n\n")
                    .append("쉐이더팩 다운로드 링크: ")
                    .append(complementaryShaderPackDownloadLink)
                    .append("\n")
                    .append("위 파일은 %appdata% 폴더 안의 .minecraft\\shaderpacks 폴더에 \"압축 풀지 않고 그대로\" 넣으시면 됩니다.")
                    .append("\n\n")
                    .append("리소스팩 다운로드 링크: ")
                    .append(faithfulResourcePackDownloadLink)
                    .append("\n")
                    .append("위 파일은 %appdata% 폴더 안의 .minecraft\\resourcepacks 폴더에 \"압축 풀지 않고 그대로\" 넣으시면 됩니다.")
                    .append("\n")
                    .append("이후 인게임에 들어와서 적용하시면 됩니다. 즐거운 플레이 되세요!")
                    .append("\n\n")
                    .append("by 휘진#0956")
                    .toString();
        }

        return serverInfoText;
    }
}
