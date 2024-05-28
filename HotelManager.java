public class HotelManager {
    private List<Hotel> hoteis;

    public HotelManager(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }

    public void cadastrarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public void modificarHotel(int id, Hotel hotelAtualizado) {
        for (Hotel hotel : hoteis) {
            if (hotel.getId() == id) {
                hotel.setNome(hotelAtualizado.getNome());
                hotel.setEndereco(hotelAtualizado.getEndereco());
                hotel.setQuartos(hotelAtualizado.getQuartos());
                // Outros campos a serem atualizados
                break;
            }
        }
    }

    public void eliminarHotel(int id) {
        hoteis.removeIf(hotel -> hotel.getId() == id);
    }
}
