package com.esa.submission1bpaai.ui.story

import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.data.model.Article

object ArticleData {
    private val foodNames = arrayOf(
        "Apa Itu Stunting dan Apa menyebabkan Stunting?",
        "Bagaimana Cara Mencegah Stunting?",
        "Pentingnya Asupan Kalsium untuk Ibu Hamil: Berapa Banyak yang Dibutuhkan?",
        "Ketahui Manfaat Berolahraga selama Masa Kehamilan",
        "Rahasia 5 Vitamin dan Mineral untuk Kehamilan yang Tidak Boleh Anda Abaikan!",
        "Potensi Makanan Tradisional sebagai Solusi Terjangkau untuk Mencegah Kekurangan Gizi Kronis",
        "Jaga Kesehatan Ibu Hamil dengan Menerapkan Pola Makan Sehat",
        "Ragam Makanan yang Mengandung Nutrisi Penting untuk Ibu Hamil")

    private val foodDetails = arrayOf(
        "Stunting adalah masalah gizi kronis akibat kurangnya asupan gizi dalam jangka waktu panjang sehingga mengakibatkan terganggunya pertumbuhan pada anak. Stunting juga menjadi salah satu penyebab tinggi badan anak terhambat, sehingga lebih rendah dibandingkan anak-anak seusianya. Tidak jarang masyarakat menganggap kondisi tubuh pendek merupakan faktor genetika dan tidak ada kaitannya dengan masalah kesehatan. Faktanya, faktor genetika memiliki pengaruh kecil terhadap kondisi kesehatan seseorang dibandingkan dengan faktor lingkungan dan pelayanan kesehatan. Biasanya, stunting mulai terjadi saat anak masih berada dalam kandungan dan terlihat saat mereka memasuki usia dua tahun. Stunting memiliki gejala-gejala yang bisa Anda kenali, misalnya:"+
        "\n - Wajah tampak lebih muda dari anak seusianya\n" + "- Pertumbuhan tubuh dan gigi yang terlambat\n" + "- Memiliki kemampuan fokus dan memori belajar yang buruk\n" + "- Pubertas yang lambat\n" + "- Saat menginjak usia 8-10 tahun, anak cenderung lebih pendiam dan tidak banyak melakukan kontak mata dengan orang sekitarnya\n" + "- Berat badan lebih ringan untuk anak seusianya\n "+
        "\n Pihak Kementrian Kesehatan menegaskan bahwa stunting merupakan ancaman utama terhadap kualitas masyarakat Indonesia. Bukan hanya mengganggu pertumbuhan fisik, anak-anak juga mengalami gangguan perkembangan otak yang akan memengaruhi kemampuan dan prestasi mereka. Selain itu, anak yang menderita stunting akan memiliki riwayat kesehatan buruk karena daya tahan tubuh yang juga buruk. Stunting juga bisa menurun ke generasi berikutnya bila tidak ditangani dengan serius.\n "+
        "\n \n Faktor-faktor yang Menyebabkan Stunting\n" + "\n Mengingat stunting adalah salah satu masalah kesehatan yang cukup membahayakan, memahami faktor penyebab stunting sangat penting untuk dilakukan. Dengan begitu, Anda bisa melakukan langkah-langkah preventif untuk menghindarinya. Berikut ini beberapa faktor penyebab stunting yang perlu Anda ketahui:\n"+
        "\n 1. Kurang Gizi dalam Waktu Lama"+"\n 2. Pola Asuh Kurang Efektif" + "\n 3. Pola makan"+"\n 4. Tidak Melakukan Perawatan Pasca Melahirkan"+"\n \n \n Sumber: RSUD Dr. R. Soetijono Blora.",


                "Menyadari bahwa stunting adalah masalah kesehatan yang berisiko tinggi dan dapat memengaruhi pertumbuhan anak hingga dewasa, Anda tentu perlu mengenal berbagai usaha pencegahannya. Simak beberapa tindakan preventif yang dapat dilakukan untuk mencegah stunting. Tindakan pencegahan ini sebaiknya dilakukan sebelum, saat, dan sesudah masa kehamilan.\n" +
                "\n" +
                "1. Pahami Konsep Gizi\n" +
                "Pastikan Anda mendapatkan asupan gizi yang cukup setiap hari, terlebih saat masa kehamilan. Pahami konsep gizi dengan baik dan terapkan dalam pola asuh anak.\n" +
                "\n" +
                "2. Pilihan Menu Beragam\n" +
                "Upayakan untuk selalu memberi menu makanan yang beragam untuk anak. Jangan lupakan faktor gizi dan nutrisi yang dibutuhkan mereka setiap harinya. Saat masa kehamilan dan setelahnya, ibu pun perlu mendapatkan gizi yang baik dan seimbang agar dapat menghindari masalah stunting.\n" +
                "\n" +
                "3. Pemeriksaan Rutin\n" +
                "Selama masa kehamilan, ibu perlu melakukan check up atau pemeriksaan rutin untuk memastikan berat badan sesuai dengan usia kehamilan. Ibu hamil juga tidak boleh mengalami anemia atau kekurangan darah karena akan memengaruhi janin dalam kandungan. Kontrol tekanan darah ini bisa dilakukan saat check up rutin.\n" +
                "\n" +
                "4. Pentingnya ASI\n" +
                "Air susu ibu (ASI) mengandung banyak gizi baik yang dapat menunjang pertumbuhan anak. Dalam ASI, terdapat zat yang dapat membangun sistem imun anak sehingga menjauhkan mereka dari berbagai masalah kesehatan, salah satunya adalah stunting.\n" +
                "\n" +
                "5. Konsumsi Asam Folat\n" +
                "Asam folat berperan penting untuk mendukung perkembangan otak dan sumsum tulang belakang bayi. Zat ini juga dapat mengurangi risiko gangguan kehamilan hingga 72%. Dengan asupan asam folat, kegagalan perkembangan organ bayi selama masa kehamilan juga bisa dicegah.\n" +
                "\n" +
                "6. Tingkatkan Kebersihan\n" +
                "Sakit infeksi yang berulang pada anak disebabkan oleh sistem imunitas tubuh yang tidak bekerja secara maksimal. Saat imunitas tubuh anak tidak berfungsi baik, maka risiko terkena berbagai jenis gangguan kesehatan, termasuk stunting, menjadi lebih tinggi. Karena stunting adalah penyakit yang rentan menyerang anak, ada baiknya Anda selalu memastikan imunitas buah hati terjaga sehingga terhindar dari infeksi.\n" +
                "\n" +
                "7. Faktor Sanitasi\n" +
                "Faktor sanitasi dan akses air bersih menjadi salah satu fokus yang bisa Anda lakukan untuk mencegah stunting pada anak. Jagalah kebersihan diri dan lingkungan agar tidak ada bakteri, jamur, kuman, dan virus yang mengontaminasi tubuh Anda dan si kecil. Anda juga disarankan selalu memperhatikan kebersihan tubuh maupun tangan. Sebab, apabila tangan kotor, bukan tidak mungkin kuman menjangkiti makanan yang masuk ke dalam tubuh sehingga menyebabkan masalah kurang gizi. Dalam waktu lama, masalah kurang gizi yang berkepanjangan tersebut dapat menyebabkan stunting."+ "\n \n \n Sumber: RSUD Dr. R. Soetijono Blora.",

            "Kalsium memiliki peran vital dalam memperkuat pertumbuhan tulang dan gigi bayi yang pesat di dalam kandungan. Selain itu, kalsium juga memberikan kontribusi besar pada perkembangan otot, jantung, dan saraf bayi yang sedang berkembang. Tetapi, jangan lupakan kebutuhan kalsium untuk ibu sendiri. Ketika kekurangan kalsium, tubuh ibu akan mengambil cadangan kalsium dari dalam dirinya untuk memenuhi kebutuhan sang buah hati yang tumbuh di dalam rahim. Penting sekali untuk memperhatikan hal ini, terutama di trimester ketiga, ketika pertumbuhan tulang mencapai puncaknya. Setiap hari, sekitar 250-350 miligram kalsium akan dipindahkan dari tubuh ibu ke janin yang sedang dikandung. Jika asupan kalsium kurang selama kehamilan, ibu akan lebih rentan terkena osteoporosis dan masalah keropos tulang.\n\n"+ "Berapa Banyak Kebutuhan Kalsium lbu Hamil?\n" +
            "Tahukah Anda bahwa sekitar 1000 miligram kalsium per hari diperlukan oleh ibu hamil? Jadi, tak heran jika Anda perlu mengonsumsi makanan kaya kalsium setiap harinya. Jangan mengandalkan vitamin prenatal saja, karena kebanyakan dari mereka tidak menyediakan cukup kalsium yang Anda butuhkan. Tapi jangan khawatir, ada trik yang bisa Anda lakukan. Misalnya, nikmati secangkir yogurt plain rendah lemak sebagai sarapan pagi. Tapi, penting sekali untuk memperhitungkan jumlah kalsium yang sudah terkandung dalam vitamin prenatal yang Anda minum. Ini sangat penting agar Anda tidak mengonsumsi kalsium secara berlebihan. Jadi, pastikan Anda mengetahui jumlah yang tepat!\n"+"\nPilihan Makanan Kaya Kalsium untuk Menunjang Kehamilanmu\n" +
            "Susu adalah pilihan terbaik untuk mendapatkan asupan kalsium yang dibutuhkan selama kehamilan. Jika susu yang dikonsumsi juga diperkaya dengan kalsium tambahan, maka semakin baik. Tidak hanya susu, Anda juga dapat memilih produk susu lainnya seperti keju dan yogurt. Berikut adalah beberapa contoh makanan kaya kalsium yang dapat Anda konsumsi:\n" +
            "- Keju cheddar dengan kandungan 307 mg kalsium\n" +
            "- Susu kedelai yang diperkaya kalsium, memberikan 299 mg kalsium\n" +
            "- Keju mozarella yang mengandung 333 mg kalsium\n" +
            "- Ikan sarden kaleng bersama tulangnya, memberikan 325 mg kalsium\n" +
            "\n Jika Anda memiliki intoleransi laktosa atau tidak dapat mengonsumsi  produk susu, jangan khawatir! Terdapat alternatif lain yang dapat Anda pilih:\n" +
            "- Tahu dengan kandungan 253 mg kalsium\n" +
            "- Lobak hijau memberikan 148 mg kalsium\n" +
            "- Brokoli dengan kandungan 21 mg kalsium\n" +
            "\n Selain itu, jangan lupakan pentingnya asupan vitamin D agar kalsium dapat diserap dengan baik oleh tubuh. Pastikan Anda mengonsumsi makanan yang kaya akan vitamin D, seperti salmon, tuna, telur, dan jamur. Anda juga dapat mendapatkan vitamin D dengan berjemur di bawah sinar matahari yang sehat selama beberapa menit.\n"+
            "\n \n \n Sumber:"+"\n 1. What To Expect. How Much Calcium Do You Need During Pregnancy?. Mei 2020.\n" +
                    "2. WhatToExpect. Fetal Development: Baby's Bones and Skeletal System. November 2019.\n" +
                    "3. American College of Obstetricians and Gynecologists. Nutrition during pregnancy.\n" +
                    "4. Asthma and Allergy Foundation of America. Kosher labeling and milk or dairy allergy. Mei 2013.",


                "Halodoc, Jakarta - Ibu mungkin sudah tahu banyak bahwa olahraga adalah hal yang sangat baik untuk dilakukan, bahkan saat sedang hamil. Mengutip American College of Obstetricians and Gynecologists, olahraga harus menjadi bagian penting dari kehamilan yang sehat sehingga ibu sangat direkomendasikan untuk setidaknya berolahraga selama 20 hingga 30 menit setiap hari.  \n" +
                "\n Jenis olahraga yang perlu dilakukan adalah olahraga dengan intensitas sedang, semisal renang, jalan kaki, senam, atau yoga. Dengan rutin olahraga, niscaya ibu akan merasa lebih sehat selama kehamilan. Oleh karena itu, simak beberapa manfaat olahraga selama kehamilan berikut!\n"+
                "\n 1. Meningkatkan Energi\n" + "\n" +
                "Kehamilan jelas akan menguras energi ibu, tetapi saat olahraga ibu bisa terbantu untuk menyelesaikan tugas sehari-hari dengan lebih mudah. Itu karena olahraga memperkuat sistem kardiovaskular, sehingga ibu tidak mudah lelah dan memiliki energi untuk melewati masa-masa stres. Selain itu, dengan otot yang kuat dan kencang, ibu tidak perlu berusaha keras untuk melakukan aktivitas apa pun, baik itu berbelanja bahan makanan atau bekerja di kantor.\n" +
                "\n 2. Membuat Tidur Lebih Nyenyak\n"  + "\n" +
                "Saat kehamilan tengah berkembang, menemukan posisi tidur yang nyaman bisa menjadi tantangan tersendiri. Namun, olahraga bisa bikin ibu merasa lelah dan kemudian membuat ibu ingin segera tidur.\n" +
                "\n 3. Menurunkan Risiko Komplikasi\n" + "\n" +
                "Faktanya, berolahraga selama kehamilan dapat menurunkan risiko terkena diabetes gestasional dan preeklampsia. Pada wanita yang mengidap diabetes gestasional, olahraga teratur dapat membuat perbedaan penting. Pasalnya, sebuah studi besar menemukan bahwa wanita dengan diabetes gestasional yang berolahraga cukup tiga kali seminggu, memiliki risiko yang lebih rendah untuk memiliki bayi baru lahir sangat besar. Dengan begini, maka ibu memiliki risiko kelahiran sesar yang lebih rendah.\n" +
                "\n4. Mengurangi Ketidaknyamanan Selama Hamil\n" + "\n" +
                "Olahraga teratur akan memperkuat otot ibu hamil, yang kemudian akan membantu tubuh mengatasi rasa sakit dan nyeri saat hamil. Melakukan peregangan dan yoga akan meredakan nyeri punggung. Sementara berjalan kaki akan meningkatkan sirkulasi darah dan berenang dapat memperkuat otot perut. Ibu bisa berganti-gantian melakukan ketiga olahraga ini dalam seminggu.\n" +
                "\n" +
                "\n 5. Mempersiapkan Persalinan\n" + "\n" +
                "Manfaat ini tampaknya sangat masuk akal karena semakin baik tubuh, maka akan semakin kuat untuk kelak melakukan persalinan. Melahirkan bisa diibaratkan lari maraton karena sama-sama membutuhkan stamina, tekad, dan fokus. Meski belum diteliti dengan baik, mempersiapkan persalinan dengan olahraga dapat meringankan persalinan dan bahkan mempersingkat waktu yang dibutuhkan untuk melahirkan bayi. Mengutip Baby Centre, sebuah penelitian mengungkapkan bahwa wanita yang berpartisipasi dalam program pengkondisian tiga kali seminggu selama kehamilan mengalami kemajuan melalui tahap pertama persalinan lebih cepat daripada wanita yang tidak mengikuti program tersebut.\n" +
                "\n" +
                "\n 6. Mengurangi Stres dan Memberikan Semangat\n" +"\n" +
                "Hamil bisa membuat stres dan membuat ibu rentan terhadap perubahan suasana hati. Dengan olahraga, maka ini akan meningkatkan kadar serotonin, zat kimia otak yang terkait dengan suasana hati, sehingga efeknya akan membuat ibu semakin bersemangat.\n" +
                "\n" +
                "\n Olahraga juga akan semakin baik jika ibu mengundang teman untuk bergabung. Tidak hanya membuat ibu jadi disiplin olahraga, memiliki teman-teman yang mendukung mungkin salah satu penghilang stres terbaik yang bisa dilakukan.\n"+"\n\n\n Sumber: Halodoc, Jakarta",


               "Kehamilan adalah momen yang penuh kebahagiaan dan juga fase penting dalam pertumbuhan dan perkembangan bayi yang sedang dikandung. Agar kehamilan berjalan dengan optimal, penting bagi ibu hamil untuk memperhatikan asupan nutrisi mikro, seperti vitamin dan mineral. Terdapat beberapa kondisi di mana suplemen vitamin dan mineral menjadi krusial, antara lain:\n" +
                "- Status nutrisi kurang atau masalah gizi buruk yang dapat terdeteksi melalui tes darah.\n" +
                "- Mengalami mual dan muntah yang parah (hiperemesis gravidarum), yang dapat menyebabkan penurunan berat badan dan kekurangan nutrisi.\n" +
                "- Menjalani pola hidup vegan atau memiliki intoleransi dan alergi makanan tertentu.\n" +
                "\n Namun, mengapa vitamin dan mineral begitu penting? Secara keseluruhan, nutrisi mikro memainkan peran yang sangat penting dalam mencapai hasil kehamilan yang optimal dan mendukung fungsi metabolik yang baik untuk pertumbuhan dan fungsi jaringan janin yang sehat.\n"+
                   "5 Suplemen yang Tidak Boleh Dilewatkan Selama Kehamilan\n \n" +
                "1. Asam folat: Vitamin B yang esensial untuk pertumbuhan dan perkembangan janin. Kekurangan asam folat dapat menyebabkan kelainan pada ibu dan janin. Dianjurkan mengonsumsi setidaknya 400 mcg per hari sebelum hamil dan 600 mcg selama kehamilan.\n" +
                "2. Zat besi: Penting untuk transportasi oksigen dan pertumbuhan selama kehamilan. Dianjurkan mengonsumsi 27 mg per hari dan meningkatkan penyerapan dengan vitamin C.\n" +
                "3. DHA: Asam lemak omega-3 yang mendukung kesehatan sel dalam tubuh. Suplemen DHA membantu mencegah persalinan prematur dan menjaga keseimbangan mood pasca melahirkan.\n" +
                "4. Kalsium: Kebutuhan tinggi selama kehamilan dan menyusui. Penting untuk perkembangan tulang bayi dan kesehatan ibu. Dianjurkan mengonsumsi sekitar 1.000 mg per hari.\n" +
                "5. Vitamin D: Kekurangan umum pada kehamilan, terutama pada kelompok berisiko tinggi. Suplemen vitamin D menurunkan risiko komplikasi preeklamsia, diabetes gestasional, berat badan lahir rendah, dan kelahiran prematur.\n" +
                "\n Suplemen ini mendukung kesehatan ibu hamil dan perkembangan janin. Penting untuk memastikan asupan yang cukup selama kehamilan, mengingat sulitnya memenuhi kebutuhan melalui makanan saja.\n"+"\n\n\n Sumber:"+"Sumber :\n" +
                       "NCBI. Vitamins & Minerals\n" +
                       "March of Dimes. Nutrients in Pregnancy",

                "Satu dari setiap empat anak balita di Indonesia mengalami stunting, yang ditandai dengan pertumbuhan terhambat, risiko kematian dini, dan masalah kognitif atau kecerdasan rendah. Data tahun 2021 menunjukkan bahwa 24,4% balita masih menghadapi masalah ini yang sangat mengkhawatirkan. \n" +
                "\n Ternyata, stunting bukanlah sekadar masalah nutrisi semata. Tentu saja kekurangan gizi kronis menjadi penyebab utama stunting, namun faktor pendidikan, budaya, dan karakteristik masyarakat juga memainkan peran yang signifikan. Salah satu contohnya adalah kurangnya pemahaman tentang gizi yang menyebabkan kurangnya perhatian dalam memilih makanan yang mencukupi kebutuhan gizi anak. Banyak masyarakat yang tidak menyadari bahwa pencegahan stunting sebenarnya bisa dilakukan dengan cara yang sederhana, tidak rumit, dan tidak memerlukan biaya besar! Misalnya, memberikan sebutir telur setiap hari sudah cukup untuk mencegah stunting! Selain itu, ada banyak makanan lokal atau tradisional yang memiliki kandungan gizi yang mencukupi untuk mencegah stunting jika diolah dengan baik.\n"+
                "\n Mencegah Stunting dari Pangan Lokal\n" +
                        "\n Dalam rangka memperingati Hari Pangan Sedunia, Indonesian Gastronomy Community (IGC) bekerja sama dengan Danone Indonesia untuk mendeklarasikan konsensus pencegahan stunting. Salah satu poin penting dari konsensus ini adalah mengedukasi masyarakat tentang pentingnya menggunakan pangan lokal yang beragam di seluruh Indonesia. Menurut Ketua Umum IGC, Ria Musiawan, inovasi pada makanan tradisional dapat membuatnya lebih menarik dan sesuai dengan selera anak-anak. Contohnya, sayur lodeh dapat diolah dengan menggunakan berbagai sayuran berwarna yang memberikan nutrisi lengkap. Hindah Muaris, Dewan Pakar IGC, juga menambahkan bahwa sumber protein hewani seperti ikan kembung memiliki kandungan omega-3 yang setara dengan salmon. \n" +
                        "\n Dengan kata lain, menu sehat untuk anak dapat disesuaikan dengan kearifan lokal masing-masing daerah. Potensi pangan Indonesia yang melimpah berasal dari pertanian, perkebunan, peternakan dan kelautan menjadi salah satu asupan nutrisi yang baik untuk anak.\n",


                "Penting bagi ibu hamil untuk selalu menjaga kesehatan dirinya selama 9 bulan kehamilan. Karena janin akan bertumbuh dengan sehat sampai waktu kelahirannya jika ibunya juga sehat. Bagaimana caranya menjaga kesehatan ibu hamil dan bayi dalam kandungan? Yakni dengan menerapkan pola hidup sehat terutama memakan makanan yang sehat\n" +
               "\n" +
               "Kondisi kesehatan selama kehamilan salah satunya sangat bergantung pada pola makan sehat yang diterapkan ibu hamil. Isilah piring makan dengan variasi makanan sehat yang bergizi tinggi untuk mendukung kesehatan diri sendiri juga janin dalam kandungan.\n" +
               "\n" +
               "Bagi ibu, makan makanan bergizi dapat membantu menambah stamina, menghindari risiko komplikasi kehamilan, dan mengontrol berat badan saat hamil tetap sehat. Dengan menerapkan pola makan yang sehat, kesehatan ibu hamil akan jauh lebih baik.\n" +
               "\n" +
               "Selain itu, ibu hamil yang menerapkan pola makan sehat juga cenderung terhindar dari depresi saat hamil. Pasalnya, makanan bergizi membantu menstabilkan mood ibu sepanjang kehamilan.\n" +
               "\n" +
               "Makanan bernutrisi yang wajib dikonsumsi agar kesehatan ibu hamil tetap terjaga adalah:\n" +
               "\n" +
               "Makanan berprotein, seperti telur yang dimasak matang, dada ayam, dan gandum utuh (roti gandum dan beras merah).\n" +
               "Makanan yang mengandung vitamin C, seperti buah jeruk, jambu biji dan stroberi.\n" +
               "Makanan dan minuman mengandung kalsium, seperti susu yang dipasteurisasi dan sayuran berwarna hijau.\n" +
               "Makanan kaya zat besi, seperti brokoli dan kacang-kacangan.\n" +
               "Makanan yang mengandung lemak sehat, misalnya ikan salmon (dimasak matang) dan buah alpukat.\n" +
               "Makanan yang mengandung asam folat, seperti kuning telur dan bayam.\n" +
               "Sementara itu, agar kesehatan ibu hamil tetap terjaga, hindari makan daging setengah matang, jeroan hewan, dan makanan cepat saji yang tinggi lemak trans selama ibu hamil menjalani pola hidup sehat.  Hindari juga makan ikan yang mengandung tinggi merkuri selama hamil, seperti ikan tuna, ikan makarel, dan ikan pedang agar kesehatan ibu hamil tetap terjaga.\n" +
               "\n" +
               "Ibu hamil juga sebaiknya lakukan pemeriksaan kesehatan ke dokter atau pusat kesehatan terdekat dengan teratur dan terjadwal.\n" +
               "\n" +
               ".\n" +
               "\n" +
               "Sumber: Promkes Kemkes RI, RS Annisa Tangerang",


                "Mudah merasa lapar saat kehamilan adalah hal yang wajar, Bunda. Pada masa pembentukan si kecil, tubuh harus bekerja ekstra sehingga asupan nutrisi yang dibutuhkan pun turut meningkat.\n" +
                "\n" +
                "Yang sering salah dipahami oleh para bunda dan ayah adalah bumil harus “makan untuk dua porsi, sekalian buat anak”. Padahal, cara kerja tubuh manusia lebih kompleks dari itu, Ayah dan Bunda. Bukan hanya sekadar makanan, Bunda juga harus memerhatikan komposisi konsumsi Bunda agar memenuhi aspek nutrisi, bervitamin, kaya mineral, dan tentunya tidak membawa efek negatif jangka panjang.\n"+
                "Nah, nutrisi penting apa saja yang sebetulnya yang dibutuhkan ibu semasa kehamilan, dan dari mana mendapatkannya?\n" +
                        "\n" +
                        "1. Asam folat dan Protein dari Kacang-kacangan, Hati, dan Sayur\n" +
                        "\n" +
                        "Selain lezat, kacang-kacangan sangat kaya akan serat, protein, dan asam folat. American College of Obstetrics and Gynecology (ACOG) merekomendasikan ibu untuk mengonsumsi 600-800 mikrogram folat selama kehamilan. Asupan folat juga bisa ditemukan pada hati, telur, sayuran berdaun hijau tua, serta kacang polong.\n" +
                        "\n" +
                        "Kacang kedelai, kacang polong, dan kacang tanah terutama akan sangat membantu tumbuh kembang si kecil dalam trimester pertama, jadi jangan sampai kudapan satu ini absen dari meja Bunda, ya!\n" +
                        "\n" +
                        "Kemudian yang perlu diperhatikan dalam menyajikan sayuran adalah jangan lupa mencucinya sebersih mungkin, ya, AyBun. Dikhawatirkan, sisa tanah pada sayuran bisa mengandung toksoplasma yang akan berbahaya bagi janin jika dikonsumsi.\n" +
                        "\n" +
                        "2. Kalsium dari Susu dan Ikan-ikanan\n" +
                        "\n" +
                        "Ibu hamil membutuhkan 1000 miligram kalsium yang bisa dibagi dalam dua dosis 500 miligram per hari. Sumber kalsium yang baik bisa ditemukan pada susu, yoghurt, keju, ikan dan seafood yang rendah merkuri, seperti ikan lele, udang, salmon, dan tahu, juga sayuran berdaun hijau tua.\n" +
                        "\n" +
                        "3. Protein lezat dari Ikan, Ayam, dan Telur\n" +
                        "\n" +
                        "Penuhi kebutuhan protein Bunda dan buah hati dengan kudapan lezat yang kaya protein seperti ikan, ayam (disarankan bagian dada, yang tak begitu berlemak), susu dan yoghurt, juga telur. \n" +
                        "\n" +
                        "Hanya saja, perhatikan imbauan para pakar bahwa khusus ibu hamil, sebaiknya ikan dan telur dimasak sampai matang. Sementara, konsumsi ikan yang terlalu belemak seperti ikan pedang, todak, dan pelagis juga sebaiknya dikurangi.\n" +
                        "\n" +
                        "4. Zat Besi dari Daging Merah Tanpa Lemak\n" +
                        "\n" +
                        "Zat besi yang cukup mengurangi risiko anemia defisiensi besi yang dapat menyebabkan ibu menjadi mudah lelah. Anemia defisiensi besi yang parah selama kehamilan juga meningkatkan risiko kelahiran prematur, bayi terlahir dengan berat badan yang rendah, dan depresi postpartum.\n" +
                        "\n" +
                        "Zat besi terdapat pada daging merah tanpa lemak, unggas, ikan, sayuran, dan kacang-kacangan. Untuk mengolah daging merah, usahakan sudah dimasak sampai bagian tengahnya tidak berwarna kemerahan. Hal ini untuk menghindari risiko tercemar bakteri salmonella. \n" +
                        "\n" +
                        "5. Vitamin D dari Ikan dan Jeruk \n" +
                        "\n" +
                        "Untuk membangun tulang dan gigi yang kuat dan sehat, setidaknya dibutuhkan 600 unit internasional asupan vitamin D setiap harinya. Ini bisa didapat dari pilihan makanan seperti ikan salmon, atau susu dan jus jeruk.\n" +
                        "\n" +
                        "Kebutuhan Makan Ibu Puas, Si Kecil Pun Tumbuh Cerdas!\n" +
                        "\n" +
                        "Selain mengonsumsi makanan sehat dan enak, ibu hamil juga disarankan menuruti nasihat dokter seperti beristirahat cukup, minum air yang banyak, menjaga kebersihan, serta banyak-banyak berolahraga ringan. \n" +
                        "\n" +
                        "Tentu tugas ini bukan untuk menjadi perhatian Bunda saja. Ayah bisa membantu Bunda mendapatkan jenis makanan sehat dan lezat untuk memastikan kelancaran dan kebahagiaan masa kehamilan hingga persalinan.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Sumber:\n" +
                        "American College of Obstetrics and Gynecologists: \"Nutrition During Pregnancy.\"",)

    private val foodsImages = intArrayOf(R.drawable.artikel1,
        R.drawable.artikel2,
        R.drawable.artikel3,
        R.drawable.artikel4,
        R.drawable.artikel5,
        R.drawable.artikel6,
        R.drawable.ibuhamil,
        R.drawable.artikel8)

    val listData: ArrayList<Article>
        get() {
            val list = arrayListOf<Article>()
            for (position in foodNames.indices) {
                val foods = Article(foodNames[position], foodDetails[position], foodsImages[position])
                list.add(foods)
            }
            return list
        }
}